package client.model.nurse;

import client.networking.nurse.GetRequiredDataClientNurse;
import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class GetRequiredDataModelNurseImpl implements GetRequiredDataModelNurse
{
    private GetRequiredDataClientNurse clientNurse;

    public GetRequiredDataModelNurseImpl(Object client)
    {
        clientNurse = (GetRequiredDataClientNurse) client;
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        try
        {
            return clientNurse.getAllPatients();
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
            return clientNurse.getAllDoctors();
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
            return clientNurse.getAllAppointments();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all appointments. Please try again.");
        }
    }
}
