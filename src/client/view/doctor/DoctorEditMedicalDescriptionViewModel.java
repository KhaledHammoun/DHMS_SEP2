package client.view.doctor;

import client.model.shared.GetPatientDataModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DoctorEditMedicalDescriptionViewModel
{
  private StringProperty firstName, middleName, lastName;
  private StringProperty ssn;
  private StringProperty dateOfBirth;
  private StringProperty gender;
  private StringProperty bloodType;
  private StringProperty street, no , city, zipCode;
  private StringProperty cFirstName, cMiddleName, cLastName, cTelNo;
  private StringProperty medicalDescription;

  private GetPatientDataModel getPatientDataModel;

  public DoctorEditMedicalDescriptionViewModel(GetPatientDataModel getPatientDataModel)
  {
    this.getPatientDataModel = getPatientDataModel;

    firstName = new SimpleStringProperty();

    //TODO firstName.setValue( );

    middleName =  new SimpleStringProperty();
    lastName =  new SimpleStringProperty();
    ssn = new SimpleStringProperty();
    dateOfBirth =  new SimpleStringProperty();
    gender = new SimpleStringProperty();
    bloodType = new SimpleStringProperty();
    street = new SimpleStringProperty();
    no = new SimpleStringProperty();
    city = new SimpleStringProperty();
    zipCode = new SimpleStringProperty();
    cFirstName = new SimpleStringProperty();
    cMiddleName = new SimpleStringProperty();
    cLastName = new SimpleStringProperty();
    cTelNo = new SimpleStringProperty();
    medicalDescription = new SimpleStringProperty();
  }

  public StringProperty firstNameProperty()
  {
    return firstName;
  }

  public StringProperty middleNameProperty()
  {
    return middleName;
  }

  public StringProperty lastNameProperty()
  {
    return lastName;
  }

  public StringProperty ssnProperty()
  {
    return ssn;
  }

  public StringProperty dateOfBirthProperty()
  {
    return dateOfBirth;
  }

  public StringProperty genderProperty()
  {
    return gender;
  }

  public StringProperty bloodTypeProperty()
  {
    return bloodType;
  }

  public StringProperty streetProperty()
  {
    return street;
  }

  public StringProperty noProperty()
  {
    return no;
  }

  public StringProperty cityProperty()
  {
    return city;
  }

  public StringProperty zipCodeProperty()
  {
    return zipCode;
  }

  public StringProperty cFirstNameProperty()
  {
    return cFirstName;
  }

  public StringProperty cMiddleNameProperty()
  {
    return cMiddleName;
  }

  public StringProperty cLastNameProperty()
  {
    return cLastName;
  }

  public StringProperty cTelNoProperty()
  {
    return cTelNo;
  }

  public StringProperty medicalDescriptionProperty()
  {
    return medicalDescription;
  }
}
