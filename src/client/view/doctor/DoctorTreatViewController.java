package client.view.doctor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class DoctorTreatViewController
{
  @FXML
  public TextField medicationTextField;
  @FXML
  public Label selectDiagnosisLabel;
  @FXML
  public TableView diagnosisTable;
  @FXML
  public TableColumn diagnosisName;
  @FXML
  public TableColumn diagnosisSeverity;
  @FXML
  public TableColumn diagnosisDescription;
  @FXML
  public Button addMedicationButton;
  @FXML
  public TextArea descriptionTextArea;

  public void onAddButton(ActionEvent actionEvent)
  {
    //TODO
  }
}
