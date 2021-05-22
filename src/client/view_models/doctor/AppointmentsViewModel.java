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
        Doctor doctor = (Doctor) CurrentUser.getInstance().getCurrentUser();
        if (doctor != null)
        {
            List<Appointment> appointmentsList = getAppointmentDataModel.getAppointmentsForDoctor(doctor);
            appointments.addAll(appointmentsList);
        }
    }

    public ObservableList<Appointment> getAppointments()
    {
        return appointments;
    }


}
