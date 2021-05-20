package server.database.doctor;

import server.database.DatabaseAccess;
import shared.Diagnosis;
import shared.Doctor;
import shared.Patient;
import shared.Treatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TreatAndUpdateDBAccessDoctorImpl
    implements TreatAndUpdateDBAccessDoctor
{
  @Override public void addDiagnosisToPatient(Patient patient,
      Diagnosis diagnosis)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement1 = connection.prepareStatement(
            "INSERT INTO diagnosis(severity_level, name, description) VALUES (?, ?, ?)");
        PreparedStatement preparedStatement2 = connection.prepareStatement(
            "INSERT INTO suffer_from(patient_ssn, diagnosis_id, severity_level, date_from) VALUES (?, ?, ?, ?)"))
    {
      preparedStatement1.setInt(1, diagnosis.getSeverityLevel());
      preparedStatement1.setString(2, diagnosis.getName());
      preparedStatement1.setString(3, diagnosis.getDescription());

      preparedStatement1.execute();

      PreparedStatement getIdOfDiagnosis = connection.prepareStatement(
          "SELECT id FROM diagnosis WHERE severity_level = ? and name = ? and description = ?");
      getIdOfDiagnosis.setInt(1, diagnosis.getSeverityLevel());
      getIdOfDiagnosis.setString(2, diagnosis.getName());
      getIdOfDiagnosis.setString(3, diagnosis.getDescription());

      ResultSet resultSet = getIdOfDiagnosis.executeQuery();

      diagnosis.setId(resultSet.getInt("id"));

      preparedStatement2.setLong(1, patient.getSsn());
      preparedStatement2.setInt(2, diagnosis.getId());
      preparedStatement2.setInt(3, diagnosis.getSeverityLevel());
      preparedStatement2.setDate(4, diagnosis.getDateFrom());

      preparedStatement2.execute();

    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }

  @Override public void treatPatient(Patient patient, Diagnosis diagnosis,
      Doctor doctor, Treatment treatment)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
            "INSERT INTO treats(medication, description, doctor_ssn, patient_ssn, diagnosis_id, severity_level) VALUES (?, ?, ?, ?, ?, ?)"))
    {
      preparedStatement.setString(1, treatment.getMedication());
      preparedStatement.setString(2, treatment.getDescription());
      preparedStatement.setLong(3, doctor.getSsn());
      preparedStatement.setLong(4, patient.getSsn());
      preparedStatement.setInt(5, diagnosis.getId());
      preparedStatement.setInt(6, diagnosis.getSeverityLevel());

      preparedStatement.execute();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }

  @Override public ArrayList<Diagnosis> getAllDiseasesOfPatient(Patient patient)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
            "SELECT diagnosis.id, diagnosis.severity_level, diagnosis.name, diagnosis.description FROM diagnosis JOIN suffer_from sf ON diagnosis.id = sf.diagnosis_id WHERE patient_ssn = ?;"))
    {
      preparedStatement.setLong(1, patient.getSsn());

      ResultSet rs = preparedStatement.executeQuery();

      ArrayList<Diagnosis> result = new ArrayList<>();
      while (rs.next())
      {
        result.add(
            new Diagnosis(rs.getString("name"), rs.getInt("severity_level"),
                rs.getString("description"), null, rs.getInt("id")));
      }
      return result;
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  @Override public void editDiagnosis(Diagnosis diagnosis)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
            "UPDATE diagnosis set name = ?, description = ? WHERE id = ?"))
    {
      preparedStatement.setString(1, diagnosis.getName());
      preparedStatement.setString(2, diagnosis.getDescription());
      preparedStatement.setInt(3, diagnosis.getId());

      preparedStatement.execute();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }
}
