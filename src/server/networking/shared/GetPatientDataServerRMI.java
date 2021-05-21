package server.networking.shared;

import shared.Patient;

import java.util.ArrayList;

public class GetPatientDataServerRMI implements GetPatientDataServer
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
