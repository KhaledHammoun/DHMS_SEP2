package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import shared.Doctor;
import shared.Patient;

public class MakeAppointmentController implements ViewController
{
  @FXML private TableView<Doctor> doctorsTableViewMakeAppointment;
  @FXML private TableColumn<Doctor, String> firstNameColumnDoctors;
  @FXML private TableColumn<Doctor, String> lNameColumnDoctors;
  @FXML private TableColumn<Doctor, Long> ssnColumnDoctors;
  @FXML private TextField timeMakeAppointmentTxtField;
  @FXML private DatePicker makeAppointmentDateField;
  @FXML private TableView<Patient> patientsTableViewMakeAppointment;
  @FXML private TableColumn<Patient, String> fNameColumnPatients;
  @FXML private TableColumn<Patient, String> lNameColumnPatients;
  @FXML private TableColumn<Patient, Long> ssnColumnPatients;

  @FXML public void onEditPatientInfo(ActionEvent actionEvent)
  {
  }

  @FXML public void onConfirmMakeAppointment(ActionEvent actionEvent)
  {
  }

  @FXML public void onBackMakeAppointment(ActionEvent actionEvent)
  {
  }

  @FXML public void onClearMakeAppointment(ActionEvent actionEvent)
  {
  }

  @FXML public void onSeeAllAppointments(ActionEvent actionEvent)
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {

  }
}
