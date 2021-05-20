package client.view.doctor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DoctorAddEditSampleViewController
{
  @FXML
  public TableView sampleTable;
  @FXML
  public TableColumn sampleType;
  @FXML
  public TableColumn sampleDeadline;
  @FXML
  public TableColumn samplePriority;
  @FXML
  public TableColumn result;
  @FXML
  public Button addSampleButton;
  @FXML
  public Button editSampleButton;

  public void onAddButton(ActionEvent actionEvent)
  {
    //TODO change view
  }

  public void onEditSampleButton(ActionEvent actionEvent)
  {
    //TODO change view
  }
}
