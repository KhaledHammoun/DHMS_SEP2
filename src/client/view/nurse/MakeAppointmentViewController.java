package client.view.nurse;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.shared.SelectionModel;
import client.view.View;
import client.view.ViewController;
import client.view_models.nurse.MakeAppointmentViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
  private Patient selectedPatientForAp;
  private Doctor selectedDoctorForAp;

  @FXML public void onEditPatientButton()
  {
    SelectionModel.getInstance().set(patientsTableViewMakeAppointment.getSelectionModel().getSelectedItem());
    viewHandler.openView(View.ADD_PATIENT);
  }

  @FXML public void onSaveButton()
  {
    //TODO
    //selectedPatientForAp = patientsTableViewMakeAppointment.getSelectionModel().getSelectedItem();
    //selectedDoctorForAp = doctorsTableViewMakeAppointment.getSelectionModel().getSelectedItem();
    //viewModel.createAppointment();
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
    doctorsTableViewMakeAppointment.setItems(viewModel.getAvailableDoctors());
    firstNameColumnDoctors.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    lNameColumnDoctors.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    ssnColumnDoctors.setCellValueFactory(new PropertyValueFactory<>("ssn"));
    patientsTableViewMakeAppointment.setItems(viewModel.getAllPatients());
    fNameColumnPatients.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    lNameColumnPatients.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    ssnColumnPatients.setCellValueFactory(new PropertyValueFactory<>("ssn"));
    makeAppointmentDateField.valueProperty().bindBidirectional(
        viewModel.appointmentDateProperty());
    timeMakeAppointmentTxtField.textProperty().bindBidirectional(viewModel.appointmentTimeProperty());

    viewModel.loadData();

  }
}
