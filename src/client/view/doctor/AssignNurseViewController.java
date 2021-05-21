package client.view.doctor;

import client.core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import shared.Nurse;

import java.sql.Date;

public class AssignNurseViewController
{
  @FXML
  public TableView<Nurse> nursesTable;
  @FXML
  public TableColumn<String, Nurse> nurseFirstName;
  @FXML
  public TableColumn<String, Nurse> nurseLastName;
  @FXML
  public TableColumn<Date, Nurse> nurseDob;
  @FXML
  public TableColumn<String, Nurse> nurseEducation;
  @FXML
  public TableColumn<String, Nurse> nurseExperience;
  @FXML
  public Button assignButton;
  @FXML
  public ComboBox<Nurse> availableNursesComboBox;

  private ViewHandler viewHandler;

  public void onAssignButton(ActionEvent actionEvent)
  {
    //ToDo
  }
}
