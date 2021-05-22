package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view_models.doctor.DoctorEditMedicalDescriptionViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class DoctorEditMedicalDescriptionController
{
  @FXML
  public Label patientTitleLabel;
  @FXML
  public Label patientsFirstName;
  @FXML
  public Label patientsMiddleName;
  @FXML
  public Label patientsLastName;
  @FXML
  public Label ssn;
  @FXML
  public Label dateOfBirth;
  @FXML
  public Label gender;
  @FXML
  public Label bloodType;
  @FXML
  public Label streetLabel;
  @FXML
  public Label noLabel;
  @FXML
  public Label cityLabel;
  @FXML
  public Label zipCodeLabel;
  @FXML
  public Label contactFirstName;
  @FXML
  public Label contactMiddleName;
  @FXML
  public Label contactLastName;
  @FXML
  public Label contactTelNo;
  @FXML
  public TextArea medicalDescriptionTextArea;
  @FXML
  public Button addButton;

  private ViewHandler viewHandler;
  private DoctorEditMedicalDescriptionViewModel viewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    //TODO viewModel = viewModelFactory...

    patientsFirstName.textProperty().bind(viewModel.firstNameProperty());
    patientsMiddleName.textProperty().bind(viewModel.middleNameProperty());
    patientsLastName.textProperty().bind(viewModel.lastNameProperty());
    ssn.textProperty().bind(viewModel.ssnProperty());
    dateOfBirth.textProperty().bind(viewModel.dateOfBirthProperty());
    gender.textProperty().bind(viewModel.genderProperty());
    bloodType.textProperty().bind(viewModel.bloodTypeProperty());
    streetLabel.textProperty().bind(viewModel.streetProperty());
    noLabel.textProperty().bind(viewModel.noProperty());
    cityLabel.textProperty().bind(viewModel.cityProperty());
    zipCodeLabel.textProperty().bind(viewModel.zipCodeProperty());
    contactFirstName.textProperty().bind(viewModel.cFirstNameProperty());
    contactMiddleName.textProperty().bind(viewModel.cMiddleNameProperty());
    contactLastName.textProperty().bind(viewModel.cLastNameProperty());
    contactTelNo.textProperty().bind(viewModel.cTelNoProperty());
    medicalDescriptionTextArea.textProperty().bind(viewModel.medicalDescriptionProperty());
  }



  public void onAddButton()
  {
    //TODO
  }

  public void onBackButton()
  {
  }

  public void onClearButton()
  {
  }
}
