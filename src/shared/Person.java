package shared;

public abstract class Person
{
  private String firstName;
  private String middleName;
  private String lastName;
  private int ssn;
  private DateTime dob;
  private Address address;

  public Person(String firstName, String middleName, String lastName, int ssn,
      DateTime dob, Address address)
  {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.ssn = ssn;
    this.dob = dob;
    this.address = address;
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

  public DateTime getDob()
  {
    return dob;
  }

  public Address getAddress()
  {
    return address;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  @Override public String toString()
  {
    return "Person{" + "firstName='" + firstName + '\'' + ", middleName='"
        + middleName + '\'' + ", lastName='" + lastName + '\'' + ", ssn=" + ssn
        + ", dob=" + dob + ", address=" + address + '}';
  }
}
