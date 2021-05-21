package client.networking.shared;

import server.networking.shared.GetAppointmentDataServer;
import shared.Appointment;
import shared.Doctor;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class GetAppointmentDataClientRMI implements GetAppointmentDataClient
{
    private GetAppointmentDataServer sharedServer;

    public GetAppointmentDataClientRMI()
    {
        try
        {
            Registry registry = LocateRegistry.getRegistry(1099);
            sharedServer = (GetAppointmentDataServer) registry.lookup("GetAppointmentDataServer");
        }
        catch (RemoteException | NotBoundException e)
        {
            throw new RuntimeException("Could not connect to the server, please try again later.");
        }
    }

    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        try
        {
            return sharedServer.getAllAppointments();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all appointments. Please try again.");
        }
    }

    @Override
    public ArrayList<Appointment> getAppointmentForDoctor(Doctor doctor)
    {
        try
        {
            return sharedServer.getAppointmentForDoctor(doctor);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all appointments. Please try again.");
        }
    }

    @Override
    public Appointment getAppointment(Appointment appointment)
    {
        return null;
    }
}
