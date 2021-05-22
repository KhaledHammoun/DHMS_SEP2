package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import client.view_models.doctor.AddEditSampleViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddEditSampleViewController implements ViewController
{

  @FXML
  private TextField result;
  @FXML
  private Button saveButton;
  @FXML
  private ComboBox<String> sampleType;
  @FXML
  private DatePicker deadline;
  @FXML
  private ComboBox<String> priority;

  private ViewHandler viewHandler;
  private AddEditSampleViewModel addEditSampleViewModel;

  @FXML
  public void onSaveButton()
  {
    //TODO
  }

  @FXML
  public void onBackButton()
  {
  }

  @FXML
  public void onClearButton()
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
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
}
