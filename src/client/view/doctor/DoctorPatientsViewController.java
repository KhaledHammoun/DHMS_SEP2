package client.view.doctor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DoctorPatientsViewController
{
  @FXML
  public TableView doctorViewPatientTable;
  @FXML
  public TableColumn doctorViewPatientSSN;
  @FXML
  public TableColumn doctorViewPatientFirstName;
  @FXML
  public TableColumn doctorViewPatientLastName;
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
