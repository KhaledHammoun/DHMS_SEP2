package server.database.shared;

import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public interface GetAppointmentDataDBAccess
{
    ArrayList<Appointment> getAllAppointments();
    Appointment getAppointmentForDoctor(Doctor doctor);
    Appointment getAppointment(Appointment appointment);
}
