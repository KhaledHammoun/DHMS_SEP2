package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class DoctorAddDiagnoseController
{
  @FXML
  public TextField diagnoseName;
  @FXML
  public TextField diagnoseDescription;
  @FXML
  public ComboBox<String> diagnoseSeverityLevel;
  @FXML
  public DatePicker diagnoseStartDate;
  @FXML
  public DatePicker endDate;
  @FXML
  public Button saveButton;

  private ViewHandler viewHandler;
  private DoctorAddDiagnoseViewModel doctorAddDiagnoseViewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    //TODO doctorAddDiagnoseViewModel = viewModelFactory...
    diagnoseName.textProperty().bindBidirectional(
        doctorAddDiagnoseViewModel.nameProperty());
    diagnoseDescription.textProperty().bindBidirectional(
        doctorAddDiagnoseViewModel.descriptionProperty());
    diagnoseSeverityLevel.valueProperty().bindBidirectional(
        doctorAddDiagnoseViewModel.severityLevelProperty());
    diagnoseStartDate.valueProperty().bindBidirectional(doctorAddDiagnoseViewModel.startDateProperty());
    endDate.valueProperty().bindBidirectional(
        doctorAddDiagnoseViewModel.endDateProperty());

  }

  public void onSave(ActionEvent actionEvent)
  {

//TODO

  }
}
