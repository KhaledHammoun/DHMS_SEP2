package client.model.shared;

import shared.Patient;

import java.util.ArrayList;

public interface GetPatientDataModel
{
    ArrayList<Patient> getAllPatients();
    Patient getPatientBySSN(long ssn);
}
