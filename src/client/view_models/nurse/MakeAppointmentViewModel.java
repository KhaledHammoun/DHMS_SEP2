package client.view_models.nurse;

import client.model.nurse.AppointmentsModelNurse;
import client.model.shared.GetEmployeeDataModel;
import client.model.shared.GetPatientDataModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.sql.Timestamp;
import java.time.LocalDate;

public class MakeAppointmentViewModel
{
  private ObservableList<Patient> allPatients;
  private ObservableList<Doctor> availableDoctors;

  private ObjectProperty<LocalDate> appointmentDate;
  private StringProperty appointmentTime;

  private GetEmployeeDataModel getEmployeeDataModel;
  private AppointmentsModelNurse appointmentsModelNurse;
  private GetPatientDataModel getPatientDataModel;


  public MakeAppointmentViewModel(Object appointmentsModelNurse,
      Object getEmployeeDataModel, Object getPatientDataModel)
  {
    this.getEmployeeDataModel = (GetEmployeeDataModel) getEmployeeDataModel;
    this.getPatientDataModel = (GetPatientDataModel) getPatientDataModel;
    this.appointmentsModelNurse = (AppointmentsModelNurse) appointmentsModelNurse;
    allPatients = FXCollections.observableArrayList();
    availableDoctors = FXCollections.observableArrayList();
    appointmentDate = new SimpleObjectProperty<>();
    appointmentTime = new SimpleStringProperty();
  }

  public ObservableList<Patient> getAllPatients()
  {
    return allPatients;
  }

  public ObservableList<Doctor> getAvailableDoctors()
  {
    return availableDoctors;
  }

  public ObjectProperty<LocalDate> appointmentDateProperty()
  {
    return appointmentDate;
  }

  public StringProperty appointmentTimeProperty()
  {
    return appointmentTime;
  }

  public void createAppointment(Patient patient, Doctor doctor)
  {

    Timestamp timestamp =  Timestamp.valueOf(appointmentDate.get().toString() +" "+ appointmentTime.get());
    Timestamp from = new Timestamp(timestamp.getTime());
    timestamp.setTime(timestamp.getTime()+3600000);

    Appointment appointment = new Appointment(from,timestamp,doctor.getSsn(),patient.getSsn());
    appointmentsModelNurse.createAppointment(appointment);
  }

  public void loadData()
  {
    allPatients.setAll(getPatientDataModel.getAllPatients());
    availableDoctors.setAll(getEmployeeDataModel.getListOfAllDoctors());
  }

  public void clearAppointment()
  {
    appointmentDate.set(null);
    appointmentTime.set("");

  }
}
