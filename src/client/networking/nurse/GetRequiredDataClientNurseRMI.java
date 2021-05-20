package client.networking.nurse;

import server.networking.nurse.GetRequiredDataServerNurse;
import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class GetRequiredDataClientNurseRMI implements GetRequiredDataClientNurse
{
    private GetRequiredDataServerNurse serverNurse;

    public GetRequiredDataClientNurseRMI()
    {
        try
        {
            Registry registry = LocateRegistry.getRegistry(1099);
            serverNurse = (GetRequiredDataServerNurse) registry.lookup("GerRequiredDataServer");
        }
        catch (RemoteException | NotBoundException e)
        {
            throw new RuntimeException("Could not connect to the server, please try again later.");
        }
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        try
        {
            return serverNurse.getAllPatients();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all patients. Please try again.");
        }
    }

    @Override
    public ArrayList<Doctor> getAllDoctors()
    {
        try
        {
            return serverNurse.getAllDoctors();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all doctors. Please try again.");
        }
    }

    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        try
        {
            return serverNurse.getAllAppointments();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all appointments. Please try again.");
        }
    }
}
