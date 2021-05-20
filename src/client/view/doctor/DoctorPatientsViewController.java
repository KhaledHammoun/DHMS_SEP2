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
  public TableColumn<String,Patient> doctorViewPatientSSN;
  @FXML
  public TableColumn<String,Patient> doctorViewPatientFirstName;
  @FXML
  public TableColumn<String,Patient> doctorViewPatientLastName;
  @FXML
  public Label doctorViewPatientLabel;
  @FXML
  public Button doctorViewTreatButton;
  @FXML
  public Button doctorViewAddSampleButton;
  @FXML
  public Button doctorViewDiagnoseButton;
  @FXML
  public Button doctorViewEditMedicalDescription;

  private ViewHandler viewHandler;
  private DoctorPatientsViewModel doctorPatientsViewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    //TODO doctorPatientsViewModel = viewModelFactory...
    doctorPatientsViewModel.loadPatients();
    doctorViewPatientTable.setItems(doctorPatientsViewModel.getPatients());
    doctorViewPatientSSN.setCellValueFactory(new PropertyValueFactory<>("ssn"));
    doctorViewPatientFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    doctorViewPatientLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));

  }

  public void onTreatButton(ActionEvent actionEvent)
  {
    //TODO change view
  }

  public void onAddSample(ActionEvent actionEvent)
  {
    //TODO change view
  }

  public void onDiagnoseButton(ActionEvent actionEvent)
  {
    //TODO change view
  }

  public void onEditMedicalDescription(ActionEvent actionEvent)
  {
    //TODO change view
  }
}
