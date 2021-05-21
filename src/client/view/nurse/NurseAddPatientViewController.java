package client.view.nurse;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NurseAddPatientViewController
{
  @FXML private TextField patientFName;
  @FXML private TextField patientMName;
  @FXML private TextField patientLName;
  @FXML private DatePicker patientDOB;
  @FXML private TextField patientEmergencyFName;
  @FXML private TextField patientEmergencyLName;
  @FXML private TextField patientEmergencyPhoneNumber;
  @FXML private TextField patentStreetNo;
  @FXML private TextField patientStreetName;
  @FXML private TextField patientCity;
  @FXML private TextField patientZip;
  @FXML private TextField patientGender;
  @FXML private TextField patientBloodType;
  @FXML private TextField patientSSN;
  @FXML private TextArea patientMedicalDescription;

  @FXML public void onBackButton()
  {
  }

  @FXML public void onClearButton()
  {
  }

  @FXML public void onMakeAppointmentButton()
  {
  }

  @FXML public void onSaveButton()
  {
  }
}
