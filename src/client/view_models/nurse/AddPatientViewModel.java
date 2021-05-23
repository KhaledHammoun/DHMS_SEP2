package client.view_models.nurse;

import client.model.nurse.PatientModelNurse;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class AddPatientViewModel
{
  private StringProperty firstNamePatient;
  private StringProperty middleNamePatient;
  private StringProperty lastNamePatient;
  private ObjectProperty<LocalDate> dobPatient;
  private StringProperty genderPatient;
  private StringProperty bloodTypePatient;
  private StringProperty ssnPatient;
  private StringProperty streetPatient;
  private StringProperty streetNoPatient;
  private StringProperty cityPatient;
  private StringProperty zipCodePatient;
  private StringProperty contactFirstName;
  private StringProperty contactLastName;
  private StringProperty contactPhoneNo;
  private StringProperty medicalDescriptionPatient;

  private PatientModelNurse patientModelNurse;

  public AddPatientViewModel(Object patientModelNurse)
  {
    this.patientModelNurse = (PatientModelNurse) patientModelNurse;
    firstNamePatient = new SimpleStringProperty();
    middleNamePatient = new SimpleStringProperty();
    lastNamePatient = new SimpleStringProperty();
    dobPatient = new SimpleObjectProperty<>();
    genderPatient = new SimpleStringProperty();
    bloodTypePatient =  new SimpleStringProperty();
    ssnPatient = new SimpleStringProperty();
    streetPatient = new SimpleStringProperty();
    streetNoPatient = new SimpleStringProperty();
    cityPatient = new SimpleStringProperty();
    zipCodePatient = new SimpleStringProperty();
    contactFirstName =  new SimpleStringProperty();
    contactLastName = new SimpleStringProperty();
    contactPhoneNo =  new SimpleStringProperty();
    medicalDescriptionPatient = new SimpleStringProperty();

  }

  public StringProperty firstNamePatientProperty()
  {
    return firstNamePatient;
  }

  public StringProperty middleNamePatientProperty()
  {
    return middleNamePatient;
  }

  public StringProperty lastNamePatientProperty()
  {
    return lastNamePatient;
  }

  public ObjectProperty<LocalDate> dobPatientProperty()
  {
    return dobPatient;
  }

  public StringProperty genderPatientProperty()
  {
    return genderPatient;
  }

  public StringProperty bloodTypePatientProperty()
  {
    return bloodTypePatient;
  }

  public StringProperty ssnPatientProperty()
  {
    return ssnPatient;
  }

  public StringProperty streetPatientProperty()
  {
    return streetPatient;
  }

  public StringProperty streetNoPatientProperty()
  {
    return streetNoPatient;
  }

  public StringProperty cityPatientProperty()
  {
    return cityPatient;
  }

  public StringProperty zipCodePatientProperty()
  {
    return zipCodePatient;
  }

  public StringProperty contactFirstNameProperty()
  {
    return contactFirstName;
  }

  public StringProperty contactLastNameProperty()
  {
    return contactLastName;
  }

  public StringProperty contactPhoneNoProperty()
  {
    return contactPhoneNo;
  }

  public StringProperty medicalDescriptionPatientProperty()
  {
    return medicalDescriptionPatient;
  }

  public void savePatient()
  {

    //TODO dob needs to be changed in LocalDate in all classes from shared
    /*
    Address address =  new Address(streetPatient.getValue(),
        streetNoPatient.getValue(),zipCodePatient.getValue(), cityPatient.getValue());
    Patient patient =  new Patient(firstNamePatient.getValue(),
        middleNamePatient.getValue(), lastNamePatient.getValue(),Long.parseLong(ssnPatient.getValue()),dobPatient.getValue(),address,contactFirstName.getValue(),null,
        contactLastName.getValue(), contactPhoneNo.getValue(),bloodTypePatient.getValue(),medicalDescriptionPatient.getValue(), genderPatient.getValue().charAt(0));
    patientModelNurse.addPatient(patient);

     */
  }
}
