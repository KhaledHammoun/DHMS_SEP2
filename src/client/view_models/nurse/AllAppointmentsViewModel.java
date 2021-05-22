package client.view_models.nurse;

import client.model.nurse.AppointmentsModelNurse;
import client.model.shared.GetAppointmentDataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Appointment;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class AllAppointmentsViewModel
{
  private ObservableList<Appointment> allAppointments;
  private GetAppointmentDataModel getAppointmentDataModel;
  private AppointmentsModelNurse appointmentsModelNurse;

  public AllAppointmentsViewModel(Object getAppointmentDataModel, Object appointmentsModelNurse )
  {
    this.getAppointmentDataModel = (GetAppointmentDataModel) getAppointmentDataModel;
    this.appointmentsModelNurse = (AppointmentsModelNurse) appointmentsModelNurse;
    //ToDo implement observer
    //getAppointmentDataModel.addListener("NewAppointment",this::onNewAppointment);
    allAppointments = FXCollections.observableArrayList();
  }

  private void onNewAppointment(PropertyChangeEvent evt)
  {
    allAppointments.add((Appointment) evt.getNewValue());
  }

  public void loadAppointments()
  {
    List<Appointment> appointmentList = getAppointmentDataModel.getAllAppointments();
    allAppointments.addAll(appointmentList);
  }

  public ObservableList<Appointment> getAllAppointments()
  {
    return allAppointments;
  }

  public void removeAnAppointment(Appointment appointment)
  {
    appointmentsModelNurse.removeAppointment(appointment);
  }
}
