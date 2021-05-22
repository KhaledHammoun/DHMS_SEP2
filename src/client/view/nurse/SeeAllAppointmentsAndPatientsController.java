package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import shared.Appointment;

import java.sql.Timestamp;

public class SeeAllAppointmentsAndPatientsController implements ViewController
{
  @FXML private TableView<Appointment> appointmentsTableView;
  @FXML private TableColumn<Appointment, Timestamp> startDateAppColumn;
  @FXML private TableColumn<Appointment, Timestamp> endDateAppColumn;
  @FXML private TableColumn<Appointment, Long> patientSSNAppColumn;
  @FXML private TableColumn<Appointment, String> fNamePatientAppColumn;
  @FXML private TableColumn<Appointment, Long> doctorSSNAppColumn;
  @FXML private TableColumn<Appointment, String> lNamePatientAppColumn;

  @FXML public void onRemoveAppointment(ActionEvent actionEvent)
  {
  }

  @FXML public void onBackAppointments(ActionEvent actionEvent)
  {
  }

  @FXML public void onConfirmChangesApp(ActionEvent actionEvent)
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {

  }
}
