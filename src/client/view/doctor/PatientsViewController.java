package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.shared.SelectionModel;
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
  @FXML private TableView<Patient> doctorViewPatientTable;
  @FXML private TableColumn<Long, Patient> doctorViewPatientSSN;
  @FXML private TableColumn<String, Patient> doctorViewPatientFirstName;
  @FXML private TableColumn<String, Patient> doctorViewPatientLastName;
  private ViewHandler viewHandler;
  private PatientsViewModel patientsViewModel;

  @FXML public void onTreatButton()
  {
    patientsViewModel.setSelectedPatient(
        doctorViewPatientTable.getSelectionModel().getSelectedItem());
    if (patientsViewModel.isPatientSelected())
    {
      viewHandler.openView(View.TREAT_PATIENT);
    }
  }

  @FXML public void onAddEditSample()
  {
    patientsViewModel.setSelectedPatient(
        doctorViewPatientTable.getSelectionModel().getSelectedItem());
    SelectionModel.getInstance().setLastOpenedView(View.PATIENTS);
    if (patientsViewModel.isPatientSelected())
    {
      viewHandler.openView(View.PATIENTS_SAMPLE);
    }
  }

  @FXML public void onDiagnoseButton()
  {
    patientsViewModel.setSelectedPatient(
        doctorViewPatientTable.getSelectionModel().getSelectedItem());
    if (patientsViewModel.isPatientSelected())
    {
      viewHandler.openView(View.ADD_DIAGNOSE);
    }
  }

  @FXML public void onEditMedicalDescription()
  {
    patientsViewModel.setSelectedPatient(
        doctorViewPatientTable.getSelectionModel().getSelectedItem());
    if (patientsViewModel.isPatientSelected())
    {
      viewHandler.openView(View.PATIENT_INFO);
    }
  }

  @FXML public void onBackButton()
  {
    SelectionModel.getInstance().set(null);
    viewHandler.openView(View.DOCTOR_MAIN);
  }

  @Override public void init(ViewModelFactory viewModelFactory,
      ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;

    patientsViewModel = (PatientsViewModel) viewModelFactory
        .getViewModel(View.PATIENTS);
    patientsViewModel.loadPatients();

    doctorViewPatientTable.setItems(patientsViewModel.getPatients());
    doctorViewPatientSSN.setCellValueFactory(new PropertyValueFactory<>("ssn"));
    doctorViewPatientFirstName
        .setCellValueFactory(new PropertyValueFactory<>("firstName"));
    doctorViewPatientLastName
        .setCellValueFactory(new PropertyValueFactory<>("lastName"));
  }
}
