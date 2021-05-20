package shared;

import java.io.Serializable;
import java.sql.Date;

public class Doctor extends Employee implements Serializable
{
  private String specialization;

  public Doctor(String firstName, String middleName, String lastName, long ssn,
                Date dob, Address address, String contactFirstName, String contactMiddleName, String contactLastName,
                String contactPhoneNumber, Date startDate, String education, String specialization)
  {
    super(firstName, middleName, lastName, ssn, dob, address, contactFirstName, contactMiddleName, contactLastName,  contactPhoneNumber,startDate,
        education);
    this.specialization = specialization;
  }

  public String getSpecialization()
  {
    return specialization;
  }

  public void setSpecialization(String specialization)
  {
    this.specialization = specialization;
  }

  @Override public String toString()
  {
    return super.toString() + "specialization='" + specialization + '\'';
  }
}
