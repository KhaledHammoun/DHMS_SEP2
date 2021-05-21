package server.model.shared;

import server.database.shared.GetPatientDataDBAccess;
import server.database.shared.GetPatientDataDBAccessImpl;
import shared.Patient;

import java.util.ArrayList;

public class GetPatientDataServerModelImpl implements GetPatientDataServerModel
{
    private GetPatientDataDBAccess sharedDBAccess;

    public GetPatientDataServerModelImpl()
    {
        sharedDBAccess = new GetPatientDataDBAccessImpl();
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return sharedDBAccess.getAllPatients();
    }

    @Override
    public Patient getPatientBySSN(long ssn)
    {
        return sharedDBAccess.getPatientBySSN(ssn);
    }
}
