package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.nurse.AddPatientViewModel;
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

  private ViewHandler viewHandler;
  private AddPatientViewModel viewModel;

  @FXML public void onBackButtonAddPatient()
  {
    viewHandler.openView(View.MAKE_APPOINTMENT);
  }

  @FXML public void onClearButtonAddPatient()
  {
  }

  @FXML public void onMakeAppointmentAddPatient()
  {
  }

  @FXML public void onSaveButtonAddPatient()
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    this.viewModel = (AddPatientViewModel) viewModelFactory.getViewModel(View.ADD_PATIENT);
  }
}
