package server.model.shared;

import shared.Patient;

import java.util.ArrayList;

public interface GetPatientDataServerModel
{
    ArrayList<Patient> getAllPatients();
    Patient getPatientBySSN(long ssn);
}
