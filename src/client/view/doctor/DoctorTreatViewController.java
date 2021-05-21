package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Diagnosis;

public class DoctorTreatViewController
{

  @FXML
  public Label selectDiagnosisLabel;
  @FXML
  public TableView<Diagnosis> diagnosisTable;
  @FXML
  public TableColumn<String, Diagnosis> diagnosisName;
  @FXML
  public TableColumn<Integer, Diagnosis> diagnosisSeverity;
  @FXML
  public TableColumn<String, Diagnosis> diagnosisDescription;
  @FXML
  public Button addMedicationButton;
  @FXML
  public TextField medicationTextField;
  @FXML
  public TextArea descriptionTextArea;

  private ViewHandler viewHandler;

  private DoctorTreatViewModel doctorTreatViewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    //TODO doctorTreatViewModel = viewModelFactory...

    diagnosisTable.setItems(doctorTreatViewModel.getDiagnoses());
    diagnosisName.setCellValueFactory(new PropertyValueFactory<>("name"));
    diagnosisSeverity.setCellValueFactory(new PropertyValueFactory<>("severityLevel"));
    diagnosisDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
    medicationTextField.textProperty().bind(doctorTreatViewModel.medicationProperty());
    descriptionTextArea.textProperty().bind(doctorTreatViewModel.descriptionProperty());

  }

  public void onAddButton(ActionEvent actionEvent)
  {
    //TODO get the patient selected, the disease selected and add medication and description in treat table

  }
}
