package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Appointment;

import java.sql.Timestamp;

public class AppointmentsViewController
{
  @FXML
  public TableView<Appointment> appointmentsTable;
  @FXML
  public TableColumn<Timestamp, Appointment> startDateTime;
  @FXML
  public TableColumn<Timestamp, Appointment> endDateTime;
  @FXML
  public TableColumn<Long, Appointment> patientSSN;


  private ViewHandler viewHandler;
  private AppointmentsViewModel appointmentsViewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
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
