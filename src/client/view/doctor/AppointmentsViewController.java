package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import client.view_models.doctor.AppointmentsViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Appointment;

import java.sql.Timestamp;

public class AppointmentsViewController implements ViewController
{
  @FXML
  private TableView<Appointment> appointmentsTable;
  @FXML
  private TableColumn<Timestamp, Appointment> startDateTime;
  @FXML
  private TableColumn<Timestamp, Appointment> endDateTime;
  @FXML
  private TableColumn<Long, Appointment> patientSSN;


  private ViewHandler viewHandler;
  private AppointmentsViewModel appointmentsViewModel;

  @FXML
  public void onBackButton()
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    //TODO appointmentsViewModel = viewModelFactory...
    appointmentsViewModel.loadAppointments();
    appointmentsTable.setItems(appointmentsViewModel.getAppointments());
    startDateTime.setCellValueFactory(new PropertyValueFactory<>("from"));
    endDateTime.setCellValueFactory(new PropertyValueFactory<>("to"));
    patientSSN.setCellValueFactory(new PropertyValueFactory<>("patientSSN"));
  }
}
