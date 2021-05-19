package shared;

import java.io.Serializable;

public abstract class Employee extends Person implements Serializable
{
  private DateTime startDate;
  private String education;

  public Employee(String firstName, String middleName, String lastName, long ssn,
      DateTime dob, Address address,String contactFirstName, String contactMiddleName, String contactLastName, String contactPhoneNumber, DateTime startDate, String education)
  {
    super(firstName, middleName, lastName, ssn, dob, address,contactFirstName,  contactMiddleName, contactLastName,  contactPhoneNumber );
    this.startDate = startDate;
    this.education = education;
  }

  public DateTime getStartDate()
  {
    return startDate;
  }

  public String getEducation()
  {
    return education;
  }

  public void setEducation(String education)
  {
    this.education = education;
  }

  @Override public String toString()
  {
    return super.toString() + "startDate=" + startDate + ", education='" + education
        + '\'';
  }
}
