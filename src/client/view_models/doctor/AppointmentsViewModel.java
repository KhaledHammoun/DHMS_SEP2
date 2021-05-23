package client.view_models.doctor;

import client.model.shared.GetAppointmentDataModel;
import client.model.shared.GetEmployeeDataModel;
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

  public AppointmentsViewModel(Object getAppointmentDataModel)
  {
    this.getAppointmentDataModel = (GetAppointmentDataModel) getAppointmentDataModel;
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
    Doctor currentDoctorUser = (Doctor) CurrentUser.getInstance().getCurrentUser();
    List<Appointment> appointmentsList = getAppointmentDataModel
        .getAppointmentsForDoctor(currentDoctorUser);
    appointments.setAll(appointmentsList);
  }

  public ObservableList<Appointment> getAppointments()
  {
    return appointments;
  }

}
