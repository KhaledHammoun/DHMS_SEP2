package client.view.doctor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EditSampleViewController
{
  @FXML
  public TextField result;
  @FXML
  public Label typeLabel;
  @FXML
  public Label deadlineLabel;
  @FXML
  public Button saveButton;
  @FXML
  public ComboBox priority;

  public void onSaveButton(ActionEvent actionEvent)
  {
    //TODO
  }
}
