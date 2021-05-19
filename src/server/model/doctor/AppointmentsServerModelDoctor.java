package server.model.doctor;

import shared.Appointment;

import java.util.ArrayList;

public interface AppointmentsServerModelDoctor
{
    ArrayList<Appointment> getAllAppointments();
    void removeAppointment(Appointment appointment);
}
