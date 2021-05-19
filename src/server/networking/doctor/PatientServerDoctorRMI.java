package server.networking.doctor;

import shared.Patient;

import java.util.ArrayList;

public class PatientServerDoctorRMI implements PatientServerDoctor
{
    public PatientServerDoctorRMI()
    {

    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return null;
    }

    @Override
    public Patient getPatientBySNN(int SSN)
    {
        return null;
    }
}
