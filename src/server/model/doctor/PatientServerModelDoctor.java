package server.model.doctor;

import shared.Patient;

import java.util.ArrayList;

public interface PatientServerModelDoctor
{
    ArrayList<Patient> getAllPatients();
    Patient getPatientBySNN(long SSN);
}
