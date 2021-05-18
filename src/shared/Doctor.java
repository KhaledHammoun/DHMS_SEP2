package shared;

public class Doctor extends Employee
{
  private String specialization;

  public Doctor(String firstName, String middleName, String lastName, int ssn,
      DateTime dob, Address address, DateTime startDate, String education, String specialization)
  {
    super(firstName, middleName, lastName, ssn, dob, address, startDate,
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
