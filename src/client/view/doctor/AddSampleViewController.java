package client.view.doctor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddSampleViewController
{

  @FXML
  public TextField result;
  @FXML
  public Button addButton;
  @FXML
  public ComboBox sampleType;
  @FXML
  public DatePicker deadline;
  @FXML
  public ComboBox priority;

  public void onAddButton(ActionEvent actionEvent)
  {
    //TODO
  }
}
