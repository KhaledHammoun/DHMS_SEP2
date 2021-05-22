package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.doctor.PatientsViewModel;
import javafx.fxml.FXML;
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
  private ViewHandler viewHandler;
  private PatientsViewModel patientsViewModel;

  private long selectedPatient ;
  private Patient patient;


  @FXML
  public void onTreatButton()
  {
    viewHandler.openView(View.TREAT_PATIENT);
    patient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue();
    patientsViewModel.getAllDiseasesOfPatient(patient);
  }

  @FXML
  public void onAddEditSample()
  {
    viewHandler.openView(View.ADD_EDIT_SAMPLE);
    patient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue();
    patientsViewModel.getAllSamples(patient);
  }

  @FXML
  public void onDiagnoseButton()
  {
    viewHandler.openView(View.ADD_DIAGNOSE);
  }

  @FXML
  public void onEditMedicalDescription()
  {
    viewHandler.openView(View.EDIT_MEDICAL_DESCRIPTION);
    selectedPatient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue()
        .getSsn();
    patientsViewModel.editMedicalDescription(selectedPatient);
  }

  @FXML
  public void onBackButton()
  {
    viewHandler.openView(View.DOCTOR_MAIN);
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;

    patientsViewModel = (PatientsViewModel) viewModelFactory.getViewModel(View.PATIENTS);
    patientsViewModel.loadPatients();

    doctorViewPatientTable.setItems(patientsViewModel.getPatients());
    doctorViewPatientSSN.setCellValueFactory(new PropertyValueFactory<>("ssn"));
    doctorViewPatientFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    doctorViewPatientLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
  }
}
