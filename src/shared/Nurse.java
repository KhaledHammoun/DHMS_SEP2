package shared;

public class Nurse extends Employee
{
  private String experience;

  public Nurse(String firstName, String middleName, String lastName, int ssn,
      DateTime dob, Address address, DateTime startDate, String education, String experience)
  {
    super(firstName, middleName, lastName, ssn, dob, address, startDate,
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
