package client.model.nurse;


import client.networking.nurse.PatientClientNurse;
import shared.Patient;

import java.rmi.RemoteException;

public class PatientModelNurseImpl implements PatientModelNurse
{
    private PatientClientNurse clientNurse;

    public PatientModelNurseImpl(Object client)
    {
        clientNurse = (PatientClientNurse) client;
    }

    @Override
    public void addPatient(Patient patient)
    {
        try
        {
            clientNurse.addPatient(patient);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while adding patient. Please try again.");
        }
    }

    @Override
    public void editPatient(Patient patient)
    {
        try
        {
            clientNurse.editPatient(patient);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while editing patient. Please try again.");
        }
    }

    @Override
    public void removePatient(Patient patient)
    {
        try
        {
            clientNurse.removePatient(patient);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while removing patient. Please try again.");
        }
    }

}
