package client.networking.shared;

import shared.Patient;

import java.util.ArrayList;

public class GetPatientDataClientRMI implements GetPatientDataClient
{
    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return null;
    }

    @Override
    public Patient getPatientBySSN(long ssn)
    {
        return null;
    }
}
