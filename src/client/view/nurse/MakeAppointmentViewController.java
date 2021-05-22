package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.nurse.MakeAppointmentViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import shared.Doctor;
import shared.Patient;

public class MakeAppointmentViewController implements ViewController
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

  private ViewHandler viewHandler;
  private MakeAppointmentViewModel viewModel;

  @FXML public void onEditPatientButton()
  {
    viewHandler.openView(View.ADD_PATIENT);
  }

  @FXML public void onSaveButton()
  {
  }

  @FXML public void onBackButton()
  {
    viewHandler.openView(View.NURSE_MAIN);
  }

  @FXML public void onClearButton()
  {
  }

  @FXML public void onSeeAllAppointmentsButton()
  {
    viewHandler.openView(View.ALL_APPOINTMENTS);
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    this.viewModel = (MakeAppointmentViewModel) viewModelFactory.getViewModel(View.MAKE_APPOINTMENT);
  }
}
