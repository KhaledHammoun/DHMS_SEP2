package client.model.shared;

import client.networking.shared.GetPatientDataClient;
import shared.Patient;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class GetPatientDataModelImpl implements GetPatientDataModel
{
    private GetPatientDataClient sharedClient;

    public GetPatientDataModelImpl(Object client)
    {
        sharedClient = (GetPatientDataClient) client;
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        try
        {
            return sharedClient.getAllPatients();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all patients. Please try again.");
        }
    }

    @Override
    public Patient getPatientBySSN(long ssn)
    {
        try
        {
            return sharedClient.getPatientBySSN(ssn);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching patient. Please try again.");
        }
    }
}
