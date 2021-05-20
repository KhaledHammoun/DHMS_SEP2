package server.database.nurse;

import server.database.DatabaseAccess;
import shared.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetRequiredDataDBAccessNurseImpl
    implements GetRequiredDataDBAccessNurse
{
  @Override public ArrayList<Patient> getAllPatients()
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("select * from patient"))
    {
      ArrayList<Patient> result = new ArrayList<>();

      ResultSet r = preparedStatement.executeQuery();

      while (r.next())
      {
        Address address = new Address(r.getString("add_street"),
            r.getString("add_no"), r.getString("add_zip_code"),
            r.getString("add_city"));

        result.add(new Patient(r.getString("f_name"), r.getString("mid_name"),
            r.getString("l_name"), r.getLong("ssn"), r.getDate("dob"), address,
            r.getString("contact_f_name"), r.getString("contact_mid_name"),
            r.getString("contact_l_name"), r.getString("contact_phone"),
            r.getString("blood_type"), r.getString("medical_description"),
            r.getString("gender").charAt(0)));
      }
      return result;
    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace();
    }
    return null;
  }

  @Override public ArrayList<Doctor> getAllDoctors()
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("SELECT * FROM doctor"))
    {
      ResultSet r = preparedStatement.executeQuery();

      ArrayList<Doctor> result = new ArrayList<>();

      while (r.next())
      {
        Address address = new Address(r.getString("add_street"),
            r.getString("add_no"), r.getString("add_zip_code"),
            r.getString("add_city"));

        result.add(new Doctor(r.getString("f_name"), r.getString("mid_name"),
            r.getString("l_name"), r.getLong("ssn"), r.getDate("dob"), address,
            r.getString("contact_f_name"), r.getString("contact_mid_name"),
            r.getString("contact_l_name"), r.getString("contact_phone"),
            r.getDate("start_date"), r.getString("education"),
            r.getString("specialization"),
            new Ward(r.getString("ward_name"), r.getInt("room_number")),
            r.getString("email"), r.getString("password")));
      }
      return result;
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  @Override public ArrayList<Appointment> getAllAppointments()
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("Select * from appointed"))
    {
      ResultSet resultSet = preparedStatement.executeQuery();

      ArrayList<Appointment> result = new ArrayList<>();
      while (resultSet.next())
      {
        result.add(new Appointment(resultSet.getTimestamp("time_from"),
            resultSet.getTimestamp("time_to"), resultSet.getLong("doctor_ssn"),
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
}
