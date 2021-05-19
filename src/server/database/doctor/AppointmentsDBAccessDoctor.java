package server.database.doctor;

import shared.Appointment;

import java.util.ArrayList;

public interface AppointmentsDBAccessDoctor
{
    ArrayList<Appointment> getAllAppointments();
    void removeAppointment(Appointment appointment);
}
