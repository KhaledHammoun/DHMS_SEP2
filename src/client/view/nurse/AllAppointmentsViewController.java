package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.nurse.AllAppointmentsViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import shared.Appointment;

import java.sql.Timestamp;

public class AllAppointmentsViewController implements ViewController
{
  @FXML private TableView<Appointment> appointmentsTableView;
  @FXML private TableColumn<Appointment, Timestamp> startDateAppColumn;
  @FXML private TableColumn<Appointment, Timestamp> endDateAppColumn;
  @FXML private TableColumn<Appointment, Long> patientSSNAppColumn;
  @FXML private TableColumn<Appointment, String> fNamePatientAppColumn;
  @FXML private TableColumn<Appointment, Long> doctorSSNAppColumn;
  @FXML private TableColumn<Appointment, String> lNamePatientAppColumn;

  private ViewHandler viewHandler;
  private AllAppointmentsViewModel viewModel;

  @FXML public void onRemoveButton()
  {
  }

  @FXML public void onBackButton()
  {
    viewHandler.openView(View.NURSE_MAIN);
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    this.viewModel = (AllAppointmentsViewModel) viewModelFactory.getViewModel(View.ALL_APPOINTMENTS);
  }
}
