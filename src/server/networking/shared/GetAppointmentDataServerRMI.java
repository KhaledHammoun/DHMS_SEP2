package server.networking.shared;

import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public class GetAppointmentDataServerRMI implements GetAppointmentDataServer
{
    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        return null;
    }

    @Override
    public Appointment getAppointmentForDoctor(Doctor doctor)
    {
        return null;
    }

    @Override
    public Appointment getAppointment(Appointment appointment)
    {
        return null;
    }
}
