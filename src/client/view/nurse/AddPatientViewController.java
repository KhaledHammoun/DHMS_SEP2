package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.nurse.AddPatientViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddPatientViewController implements ViewController
{
  @FXML private TextArea medicalDescryNurseToPatientTxtArea;
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

    firstNameTxtFieldPatient.textProperty().bindBidirectional(viewModel.firstNamePatientProperty());
    mNameTxtFieldPatient.textProperty().bindBidirectional(viewModel.middleNamePatientProperty());
    lNameTxtFieldPatient.textProperty().bindBidirectional(viewModel.lastNamePatientProperty());
    dobPatientDateField.valueProperty().bindBidirectional(
        viewModel.dobPatientProperty());
    medicalDescryNurseToPatientTxtArea.textProperty().bindBidirectional(viewModel.medicalDescriptionPatientProperty());
    eFirstNameTxtFieldPatient.textProperty().bindBidirectional(viewModel.contactFirstNameProperty());
    eLNameTxtFieldPatient.textProperty().bindBidirectional(viewModel.contactLastNameProperty());
    ePhnNumberTxtFieldPatient.textProperty().bindBidirectional(viewModel.contactPhoneNoProperty());
    streetTxtFieldPatient.textProperty().bindBidirectional(viewModel.streetPatientProperty());
    streetNoTxtFieldPatient.textProperty().bindBidirectional(viewModel.streetNoPatientProperty());
    cityTxtFieldPatient.textProperty().bindBidirectional(viewModel.cityPatientProperty());
    zipTxtFieldPatient.textProperty().bindBidirectional(viewModel.zipCodePatientProperty());
    genderTxtFieldPatient.textProperty().bindBidirectional(viewModel.genderPatientProperty());
    bloodTypeTxtFieldPatient.textProperty().bindBidirectional(viewModel.bloodTypePatientProperty());
    ssnTextFieldPatient.textProperty().bindBidirectional(viewModel.ssnPatientProperty());

  }
}
