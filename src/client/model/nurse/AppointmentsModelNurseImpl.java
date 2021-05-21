package client.model.nurse;

import client.networking.nurse.AppointmentsClientNurse;
import shared.Appointment;

import java.rmi.RemoteException;

public class AppointmentsModelNurseImpl implements AppointmentsModelNurse
{
    private AppointmentsClientNurse clientNurse;

    public AppointmentsModelNurseImpl(Object client)
    {
        clientNurse = (AppointmentsClientNurse) client;
    }

    @Override
    public void createAppointment(Appointment appointment)
    {
        try
        {
            clientNurse.createAppointment(appointment);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while creating appointment. Please try again.");
        }
    }

    @Override
    public void removeAppointment(Appointment appointment)
    {
        try
        {
            clientNurse.removeAppointment(appointment);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while editing appointment. Please try again.");
        }
    }
}
