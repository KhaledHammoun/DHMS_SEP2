package client.view_models.nurse;

import client.model.nurse.AppointmentsModelNurse;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Doctor;
import shared.Patient;

import java.time.LocalDate;

public class MakeAppointmentViewModel
{
  private ObservableList<Patient> allPatients;
  private ObservableList<Doctor> availableDoctors;
  private ObjectProperty<LocalDate> appointmentDate;
  private StringProperty appointmentTime;

  private AppointmentsModelNurse appointmentsModelNurse;

  public MakeAppointmentViewModel(AppointmentsModelNurse appointmentsModelNurse)
  {
    this.appointmentsModelNurse = appointmentsModelNurse;
    //ToDo implement observer when a patient/doctor is added
    allPatients = FXCollections.observableArrayList();
    availableDoctors=FXCollections.observableArrayList();
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
}
