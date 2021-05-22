package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import client.view_models.doctor.DoctorPatientsViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Patient;

public class PatientsViewController implements ViewController
{
  @FXML
  private TableView<Patient> doctorViewPatientTable;
  @FXML
  private TableColumn<Long,Patient> doctorViewPatientSSN;
  @FXML
  private TableColumn<String,Patient> doctorViewPatientFirstName;
  @FXML
  private TableColumn<String,Patient> doctorViewPatientLastName;
  @FXML
  private Label doctorViewPatientLabel;
  @FXML
  private Button doctorViewTreatButton;
  @FXML
  private Button doctorViewAddEditSampleButton;
  @FXML
  private Button doctorViewDiagnoseButton;
  @FXML
  private Button doctorViewEditMedicalDescription;

  private ViewHandler viewHandler;
  private DoctorPatientsViewModel doctorPatientsViewModel;

  private long selectedPatient ;
  private Patient patient;


  @FXML
  public void onTreatButton()
  {
    //TODO change view
    patient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue();
    doctorPatientsViewModel.getAllDiseasesOfPatient(patient);
  }

  @FXML
  public void onAddEditSample()
  {
    //TODO change view
    patient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue();
    doctorPatientsViewModel.getAllSamples(patient);
  }

  @FXML
  public void onDiagnoseButton()
  {
    //TODO change view
  }

  @FXML
  public void onEditMedicalDescription()
  {
    //TODO change view
    selectedPatient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue()
        .getSsn();
    doctorPatientsViewModel.editMedicalDescription(selectedPatient);
  }

  @FXML
  public void onBackButton()
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;

    //TODO doctorPatientsViewModel = viewModelFactory...
    //TODO treatAndUpdateModelDoctor = viewModelFactory...
    doctorPatientsViewModel.loadPatients();

    doctorViewPatientTable.setItems(doctorPatientsViewModel.getPatients());
    doctorViewPatientSSN.setCellValueFactory(new PropertyValueFactory<>("ssn"));
    doctorViewPatientFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    doctorViewPatientLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
  }
}
