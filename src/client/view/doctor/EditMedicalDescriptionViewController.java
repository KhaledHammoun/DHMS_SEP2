package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.doctor.EditMedicalDescriptionViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class EditMedicalDescriptionViewController implements ViewController
{
  @FXML
  private Label patientsFirstName;
  @FXML
  private Label patientsMiddleName;
  @FXML
  private Label patientsLastName;
  @FXML
  private Label ssn;
  @FXML
  private Label dateOfBirth;
  @FXML
  private Label gender;
  @FXML
  private Label bloodType;
  @FXML
  private Label streetLabel;
  @FXML
  private Label noLabel;
  @FXML
  private Label cityLabel;
  @FXML
  private Label zipCodeLabel;
  @FXML
  private Label contactFirstName;
  @FXML
  private Label contactMiddleName;
  @FXML
  private Label contactLastName;
  @FXML
  private Label contactTelNo;
  @FXML
  private TextArea medicalDescriptionTextArea;

  private ViewHandler viewHandler;
  private EditMedicalDescriptionViewModel viewModel;

  @FXML
  public void onAddButton()
  {
    //TODO
  }

  @FXML
  public void onBackButton()
  {
  }

  @FXML
  public void onClearButton()
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    viewModel = (EditMedicalDescriptionViewModel) viewModelFactory.getViewModel(View.EDIT_MEDICAL_DESCRIPTION);

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
}
