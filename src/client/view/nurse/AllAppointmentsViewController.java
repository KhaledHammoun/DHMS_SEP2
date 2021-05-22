package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.nurse.AllAppointmentsViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
  private Appointment selectedAppointment;

  @FXML public void onRemoveButton()
  {
    selectedAppointment = appointmentsTableView.getSelectionModel().selectedItemProperty().getValue();
    viewModel.removeAnAppointment(selectedAppointment);
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
    viewModel.loadAppointments();
    appointmentsTableView.setItems(viewModel.getAllAppointments());
    startDateAppColumn.setCellValueFactory(new PropertyValueFactory<>("from"));
    endDateAppColumn.setCellValueFactory(new PropertyValueFactory<>("to"));
    patientSSNAppColumn.setCellValueFactory(new PropertyValueFactory<>("patientSSN"));
    doctorSSNAppColumn.setCellValueFactory(new PropertyValueFactory<>("doctorSSN"));
    //TODO check for first and last name ..Class Appointment does not have name
    //fNamePatientAppColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    //lNamePatientAppColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

  }
}
