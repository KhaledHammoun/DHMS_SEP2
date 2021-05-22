package client.view_models.doctor;

import client.model.shared.GetAppointmentDataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Appointment;
import shared.CurrentUser;
import shared.Doctor;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class AppointmentsViewModel
{
  private ObservableList<Appointment> appointments;

  private GetAppointmentDataModel getAppointmentDataModel;

  public AppointmentsViewModel(GetAppointmentDataModel getAppointmentDataModel)
  {
    this.getAppointmentDataModel=getAppointmentDataModel;
    //ToDo implement observer
    //getAppointmentDataModel.addListener("NewAppointment", this::onNewAppointment);
    appointments = FXCollections.observableArrayList();
  }

  private void onNewAppointment(PropertyChangeEvent evt)
  {
    appointments.add((Appointment) evt.getNewValue());
  }
  public void loadAppointments()
  {
    List<Appointment> appointmentsList = getAppointmentDataModel.getAppointmentsForDoctor((Doctor)
        CurrentUser.getInstance().getCurrentUser());
    appointments.addAll(appointmentsList);
  }

  public ObservableList<Appointment> getAppointments()
  {
    return appointments;
  }



}