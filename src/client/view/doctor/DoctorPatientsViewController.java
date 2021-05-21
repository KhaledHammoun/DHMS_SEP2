package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Patient;

public class DoctorPatientsViewController
{
  @FXML
  public TableView<Patient> doctorViewPatientTable;
  @FXML
  public TableColumn<Long,Patient> doctorViewPatientSSN;
  @FXML
  public TableColumn<String,Patient> doctorViewPatientFirstName;
  @FXML
  public TableColumn<String,Patient> doctorViewPatientLastName;
  @FXML
  public Label doctorViewPatientLabel;
  @FXML
  public Button doctorViewTreatButton;
  @FXML
  public Button doctorViewAddEditSampleButton;
  @FXML
  public Button doctorViewDiagnoseButton;
  @FXML
  public Button doctorViewEditMedicalDescription;

  private ViewHandler viewHandler;
  private DoctorPatientsViewModel doctorPatientsViewModel;

  private long selectedPatient ;
  private Patient patient;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
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

  public void onTreatButton(ActionEvent actionEvent)
  {
    //TODO change view
    patient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue();
    doctorPatientsViewModel.getAllDiseasesOfPatient(patient);
  }

  public void onAddEditSample(ActionEvent actionEvent)
  {
    //TODO change view
    patient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue();
    doctorPatientsViewModel.getAllSamples(patient);
  }

  public void onDiagnoseButton(ActionEvent actionEvent)
  {
    //TODO change view
  }

  public void onEditMedicalDescription(ActionEvent actionEvent)
  {
    //TODO change view
    selectedPatient = doctorViewPatientTable.getSelectionModel().selectedItemProperty().getValue()
        .getSsn();
    doctorPatientsViewModel.editMedicalDescription(selectedPatient);
  }
}
