package server.database.doctor;

import server.database.DatabaseAccess;
import shared.Appointment;
import shared.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AppointmentsDBAccessDoctorImpl
    implements AppointmentsDBAccessDoctor
{
  @Override public ArrayList<Appointment> getAllAppointments(Doctor doctor)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("SELECT * FROM appointed WHERE doctor_ssn = ? AND time_to > current_date;"))
    {
      preparedStatement.setLong(1, doctor.getSsn());
      ResultSet resultSet = preparedStatement.executeQuery();

      ArrayList<Appointment> result = new ArrayList<>();
      while (resultSet.next())
      {
        result.add(new Appointment(resultSet.getTimestamp("time_from"),
            resultSet.getTimestamp("time_to"),
            resultSet.getLong("doctor_ssn"),
            resultSet.getLong("patient_ssn")));
      }
      return result;
    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace();
    }
    return null;
  }

  @Override public void removeAppointment(Appointment appointment)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("DELETE from appointed WHERE patient_ssn = ? and doctor_ssn = ? and time_from = ? and time_to = ?"))
    {
      preparedStatement.setLong(1, appointment.getPatientSSN());
      preparedStatement.setLong(2, appointment.getDoctorSSN());
      preparedStatement.setTimestamp(3, appointment.getFrom());
      preparedStatement.setTimestamp(4, appointment.getTo());

      preparedStatement.execute();
    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace();
    }
  }
}
