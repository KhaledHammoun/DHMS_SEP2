package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddEditSampleViewController
{

  @FXML
  public TextField result;
  @FXML
  public Button saveButton;
  @FXML
  public ComboBox<String> sampleType;
  @FXML
  public DatePicker deadline;
  @FXML
  public ComboBox<String> priority;

  private ViewHandler viewHandler;
  private  AddEditSampleViewModel addEditSampleViewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    //TODO addEditSampleViewModel = viewModelFactory...
    result.textProperty().bindBidirectional(
        addEditSampleViewModel.resultProperty());
    sampleType.valueProperty().bindBidirectional(
        addEditSampleViewModel.typeProperty());
    deadline.valueProperty().bindBidirectional(
        addEditSampleViewModel.deadlineProperty());
    priority.valueProperty().bindBidirectional(
        addEditSampleViewModel.priorityProperty());

  }

  public void onSaveButton(ActionEvent actionEvent)
  {
    //TODO
  }
}
