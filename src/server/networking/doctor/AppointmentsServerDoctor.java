package server.networking.doctor;

import shared.Appointment;

import java.util.ArrayList;

public interface AppointmentsServerDoctor
{
    ArrayList<Appointment> getAllAppointments();
    void removeAppointment(Appointment appointment);
}
