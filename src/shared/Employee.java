package shared;

public abstract class Employee extends Person
{
  private DateTime startDate;
  private String education;

  public Employee(String firstName, String middleName, String lastName, int ssn,
      DateTime dob, Address address, DateTime startDate, String education)
  {
    super(firstName, middleName, lastName, ssn, dob, address);
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
