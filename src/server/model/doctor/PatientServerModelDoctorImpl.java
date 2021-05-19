package server.model.doctor;

import server.database.doctor.PatientDBAccessDoctor;
import server.database.doctor.PatientDBAccessDoctorImpl;
import shared.Patient;

import java.util.ArrayList;

public class PatientServerModelDoctorImpl implements PatientServerModelDoctor
{
    private PatientDBAccessDoctor dbAccessDoctor;

    public PatientServerModelDoctorImpl()
    {
        dbAccessDoctor = new PatientDBAccessDoctorImpl();
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return dbAccessDoctor.getAllPatients();
    }

    @Override
    public Patient getPatientBySNN(int SSN)
    {
        return dbAccessDoctor.getPatientBySNN(SSN);
    }
}
