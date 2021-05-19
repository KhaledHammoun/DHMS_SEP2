package server.database.doctor;

import shared.Patient;

import java.util.ArrayList;

public interface PatientDBAccessDoctor
{
    ArrayList<Patient> getAllPatients();
    Patient getPatientBySNN(long SSN);
}
