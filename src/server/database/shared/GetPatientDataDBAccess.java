package server.database.shared;

import shared.Patient;

import java.util.ArrayList;

public interface GetPatientDataDBAccess
{
    ArrayList<Patient> getAllPatients();
    Patient getPatientBySSN(long ssn);
}
