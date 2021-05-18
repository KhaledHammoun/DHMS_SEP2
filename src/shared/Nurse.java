package shared;

public class Nurse extends Employee
{
  private int experience;

  public Nurse(String firstName, String middleName, String lastName, int ssn,
      DateTime dob, Address address, DateTime startDate, String education, int experience)
  {
    super(firstName, middleName, lastName, ssn, dob, address, startDate,
        education);
    this.experience = experience;
  }

  public int getExperience()
  {
    return experience;
  }

}
