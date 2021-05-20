package client.view.doctor;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AppointmentsViewController
{
  @FXML
  public TableView appointmentsTable;
  @FXML
  public TableColumn startDateTime;
  @FXML
  public TableColumn endDateTime;
  @FXML
  public TableColumn patientSSN;
  @FXML
  public TableColumn firstName;
  @FXML
  public TableColumn LastName;

}
