package client.model.shared;

import shared.Appointment;
import shared.Doctor;
import shared.client.ClientUpdate;
import shared.util.PropertyChangeSubject;

import java.util.ArrayList;

public interface GetAppointmentDataModel extends PropertyChangeSubject, ClientUpdate
{
    ArrayList<Appointment> getAllAppointments();
    ArrayList<Appointment> getAppointmentsForDoctor(Doctor doctor);
}
