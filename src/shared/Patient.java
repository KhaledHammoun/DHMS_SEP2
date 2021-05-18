package shared;

public class Patient extends Person
{
  private String blood_type;
  private String medical_description;
  private char gender;

  public Patient(String firstName, String middleName, String lastName, int ssn,
      DateTime dob, Address address, String blood_type, String medical_description, char gender)
  {
    super(firstName, middleName, lastName, ssn, dob, address);
    this.blood_type = blood_type;
    this.medical_description = medical_description;
    this.gender = gender;
  }

  public String getBlood_type()
  {
    return blood_type;
  }

  public String getMedical_description()
  {
    return medical_description;
  }

  public char getGender()
  {
    return gender;
  }

  public void setMedical_description(String medical_description)
  {
    this.medical_description = medical_description;
  }

  @Override public String toString()
  {
    return super.toString() + "Patient{" + "blood_type='" + blood_type + '\''
        + ", medical_description='" + medical_description + '\'' + ", gender="
        + gender + '}';
  }
}
