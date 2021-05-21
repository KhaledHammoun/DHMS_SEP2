package server.database.shared;

import server.database.DatabaseAccess;
import shared.Address;
import shared.Patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetPatientDataDBAccessImpl implements GetPatientDataDBAccess
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

  @Override public Patient getPatientBySSN(long ssn)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("SELECT * FROM patient WHERE ssn = ?"))
    {
      preparedStatement.setLong(1, ssn);

      ResultSet r = preparedStatement.executeQuery();

      Address address = new Address(r.getString("add_street"),
          r.getString("add_no"), r.getString("add_zip_code"),
          r.getString("add_city"));

      return new Patient(r.getString("f_name"), r.getString("mid_name"),
          r.getString("l_name"), r.getLong("ssn"), r.getDate("dob"), address,
          r.getString("contact_f_name"), r.getString("contact_mid_name"),
          r.getString("contact_l_name"), r.getString("contact_phone"),
          r.getString("blood_type"), r.getString("medical_description"),
          r.getString("gender").charAt(0));
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }
}
