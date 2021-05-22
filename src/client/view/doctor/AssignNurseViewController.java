package client.view.doctor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AssignNurseViewController
{
  @FXML
  public TableView nursesTable;
  @FXML
  public TableColumn nurseFirstName;
  @FXML
  public TableColumn nurseLastName;
  @FXML
  public TableColumn nurseDob;
  @FXML
  public TableColumn nurseEducation;
  @FXML
  public TableColumn nurseExperience;
  @FXML
  public Button assignButton;


  public void onAssignButton()
  {
    //ToDo
  }

    public void onBackButton()
    {
    }
}
