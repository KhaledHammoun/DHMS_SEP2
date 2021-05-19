package server.database.doctor;

import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public interface AppointmentsDBAccessDoctor
{
    ArrayList<Appointment> getAllAppointments(Doctor doctor);
    void removeAppointment(Appointment appointment);
}
