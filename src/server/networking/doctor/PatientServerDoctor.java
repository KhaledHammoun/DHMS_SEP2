package server.networking.doctor;

import shared.Patient;

import java.util.ArrayList;

public interface PatientServerDoctor
{
    ArrayList<Patient> getAllPatients();
    Patient getPatientBySNN(int SSN);
}
