package server.networking.nurse;

import shared.Appointment;

public interface AppointmentsServerNurse
{
    void createAppointment(Appointment appointment);
    void editAppointment(Appointment appointment);
}
