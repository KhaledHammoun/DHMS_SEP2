package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddPatientViewController implements ViewController
{
  @FXML private TextField firstNameTxtFieldPatient;
  @FXML private TextField mNameTxtFieldPatient;
  @FXML private TextField lNameTxtFieldPatient;
  @FXML private DatePicker dobPatientDateField;
  @FXML private TextField eFirstNameTxtFieldPatient;
  @FXML private TextField eLNameTxtFieldPatient;
  @FXML private TextField ePhnNumberTxtFieldPatient;
  @FXML private TextField streetTxtFieldPatient;
  @FXML private TextField streetNoTxtFieldPatient;
  @FXML private TextField cityTxtFieldPatient;
  @FXML private TextField zipTxtFieldPatient;
  @FXML private TextField genderTxtFieldPatient;
  @FXML private TextField bloodTypeTxtFieldPatient;
  @FXML private TextField ssnTextFieldPatient;

  @FXML public void onBackButtonAddPatient(ActionEvent actionEvent)
  {
  }

  @FXML public void onClearButtonAddPatient(ActionEvent actionEvent)
  {
  }

  @FXML public void onMakeAppointmentAddPatient(ActionEvent actionEvent)
  {
  }

  @FXML public void onSaveButtonAddPatient(ActionEvent actionEvent)
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {

  }
}
