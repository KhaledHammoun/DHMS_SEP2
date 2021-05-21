package client.model.shared;

import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public interface GetAppointmentDataModel
{
    ArrayList<Appointment> getAllAppointments();
    ArrayList<Appointment> getAppointmentForDoctor(Doctor doctor);
}
