package server.database.manager;

import server.database.DatabaseAccess;
import shared.Address;
import shared.Doctor;
import shared.Nurse;
import shared.Ward;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDBAccessImpl implements EmployeeDBAccessManager
{
  //TODO Should we return something?
  @Override public String addDoctor(Doctor doctor)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
            "INSERT INTO doctor(ssn, f_name, mid_name, l_name, add_street, add_no, add_zip_code, add_city, dob, start_date, education, specialization, ward_name, room_number, email, password, contact_f_name, contact_mid_name, contact_l_name, contact_phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"))
    {
      prepareDoctorStatement(preparedStatement, doctor);

      preparedStatement.execute();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  @Override public String addNurse(Nurse nurse)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
            "insert into nurse(ssn, doctor_ssn, f_name, mid_name, l_name, add_street, add_no, add_zip_code, add_city, dob, start_date, education, experience, email, password, contact_f_name, contact_mid_name, contact_l_name, contact_phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"))
    {
      prepareNurseStatement(preparedStatement, nurse);

      preparedStatement.execute();

    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  private void prepareNurseStatement(PreparedStatement preparedStatement,
      Nurse nurse) throws SQLException
  {
    preparedStatement.setLong(1, nurse.getSsn());
    preparedStatement.setLong(2, nurse.getDoctor_ssn());
    preparedStatement.setString(3, nurse.getFirstName());
    preparedStatement.setString(4, nurse.getMiddleName());
    preparedStatement.setString(5, nurse.getLastName());
    preparedStatement.setString(6, nurse.getAddress().getStreet());
    preparedStatement.setString(7, nurse.getAddress().getNumber());
    preparedStatement.setString(8, nurse.getAddress().getZipcode());
    preparedStatement.setString(9, nurse.getAddress().getCity());
    preparedStatement.setDate(10, nurse.getDob());
    preparedStatement.setDate(11, nurse.getStartDate());
    preparedStatement.setString(12, nurse.getEducation());
    preparedStatement.setString(13, nurse.getExperience());
    preparedStatement.setString(14, nurse.getEmail());
    preparedStatement.setString(15, nurse.getPassword());
    preparedStatement.setString(16, nurse.getContactFirstName());
    preparedStatement.setString(17, nurse.getContactMiddleName());
    preparedStatement.setString(18, nurse.getContactLastName());
    preparedStatement.setString(19, nurse.getContactPhoneNumber());
  }

  @Override public String editDoctor(Doctor doctor)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
            "UPDATE doctor SET ssn = ?, f_name = ?, mid_name = ?, l_name = ?, add_street = ?, add_no = ?, add_zip_code = ?, add_city = ?, dob = ?, start_date = ?, education = ?, specialization = ?, ward_name = ?, room_number = ?, email = ?, password = ?, contact_f_name = ?, contact_mid_name = ?, contact_l_name = ?, contact_phone = ? WHERE ssn = ?"))
    {
      prepareDoctorStatement(preparedStatement, doctor);
      preparedStatement.setLong(21, doctor.getSsn());

      preparedStatement.execute();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  @Override public String editNurse(Nurse nurse)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
            "UPDATE nurse SET ssn = ?, doctor_ssn = ?, f_name = ?, mid_name = ?, l_name = ?, add_street = ?, add_no = ?, add_zip_code = ?, add_city = ?, dob = ?, start_date = ?, education = ?, experience = ?, email = ?, password = ?, contact_f_name = ?, contact_mid_name = ?, contact_l_name = ?, contact_phone = ? WHERE ssn = ?"))
    {
      prepareNurseStatement(preparedStatement, nurse);

      preparedStatement.setLong(20, nurse.getSsn());

      preparedStatement.execute();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
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

  @Override public ArrayList<Nurse> getAllNurses()
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("SELECT * FROM nurse"))
    {
      ResultSet r = preparedStatement.executeQuery();

      ArrayList<Nurse> result = new ArrayList<>();

      while (r.next())
      {
        Address address = new Address(r.getString("add_street"),
            r.getString("add_no"), r.getString("add_zip_code"),
            r.getString("add_city"));

        result.add(new Nurse(r.getLong("ssn"), r.getLong("doctor_ssn"),
            r.getString("f_name"), r.getString("mid_name"),
            r.getString("l_name"), r.getDate("dob"), address,
            r.getString("contact_f_name"), r.getString("contact_mid_name"),
            r.getString("contact_l_name"), r.getString("contact_phone"),
            r.getDate("start_date"), r.getString("education"),
            r.getString("experience"), r.getString("email"),
            r.getString("password")));
      }
      return result;
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  @Override public String removeDoctor(Doctor doctor)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("DELETE FROM doctor WHERE ssn = ?"))
    {
      preparedStatement.setLong(1, doctor.getSsn());

      preparedStatement.execute();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  @Override public String removeNurse(Nurse nurse)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("DELETE FROM nurse WHERE ssn = ?"))
    {
      preparedStatement.setLong(1, nurse.getSsn());

      preparedStatement.execute();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  private void prepareDoctorStatement(PreparedStatement preparedStatement,
      Doctor doctor) throws SQLException
  {
    preparedStatement.setLong(1, doctor.getSsn());
    preparedStatement.setString(2, doctor.getFirstName());
    preparedStatement.setString(3, doctor.getMiddleName());
    preparedStatement.setString(4, doctor.getLastName());
    preparedStatement.setString(5, doctor.getAddress().getStreet());
    preparedStatement.setString(6, doctor.getAddress().getNumber());
    preparedStatement.setString(7, doctor.getAddress().getZipcode());
    preparedStatement.setString(8, doctor.getAddress().getCity());
    preparedStatement.setDate(9, doctor.getDob());
    preparedStatement.setDate(10, doctor.getStartDate());
    preparedStatement.setString(11, doctor.getEducation());
    preparedStatement.setString(12, doctor.getSpecialization());
    preparedStatement.setString(13, doctor.getWard().getWardName());
    preparedStatement.setInt(14, doctor.getWard().getRoomNumber());
    preparedStatement.setString(15, doctor.getEmail());
    preparedStatement.setString(16, doctor.getPassword());
    preparedStatement.setString(17, doctor.getContactFirstName());
    preparedStatement.setString(18, doctor.getContactMiddleName());
    preparedStatement.setString(19, doctor.getContactLastName());
    preparedStatement.setString(20, doctor.getContactPhoneNumber());
  }
}
