package shared;

import java.io.Serializable;

public class Nurse extends Employee implements Serializable
{
  private String experience;

  public Nurse(String firstName, String middleName, String lastName, int ssn,
      DateTime dob, Address address,String contactFirstName, String contactMiddleName, String contactLastName,
      String contactPhoneNumber, DateTime startDate, String education, String experience)
  {
    super(firstName, middleName, lastName, ssn, dob, address, contactFirstName, contactMiddleName, contactLastName,  contactPhoneNumber, startDate,
        education);
    this.experience = experience;
  }

  public String getExperience()
  {
    return experience;
  }

  public void setExperience(String experience)
  {
    this.experience = experience;
  }

  @Override public String toString()
  {
    return super.toString() + "experience='" + experience + '\'';
  }
}
