package shared;

public class Person
{
  private String firstName;
  private String middleName;
  private String lastName;
  private int ssn;

  public Person(String firstName, String middleName, String lastName, int ssn)
  {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.ssn = ssn;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getMiddleName()
  {
    return middleName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public int getSsn()
  {
    return ssn;
  }
}
