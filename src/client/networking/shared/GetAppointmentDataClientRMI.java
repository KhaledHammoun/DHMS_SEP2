package client.networking.shared;

import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public class GetAppointmentDataClientRMI implements GetAppointmentDataClient
{
    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        return null;
    }

    @Override
    public ArrayList<Appointment> getAppointmentForDoctor(Doctor doctor)
    {
        return null;
    }

    @Override
    public Appointment getAppointment(Appointment appointment)
    {
        return null;
    }
}