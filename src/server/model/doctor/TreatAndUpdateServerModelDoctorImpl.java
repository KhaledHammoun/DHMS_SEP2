package server.model.doctor;

import server.database.doctor.TreatAndUpdateDBAccessDoctor;
import server.database.doctor.TreatAndUpdateDBAccessDoctorImpl;
import shared.Diagnosis;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public class TreatAndUpdateServerModelDoctorImpl implements TreatAndUpdateServerModelDoctor
{
    private TreatAndUpdateDBAccessDoctor dbAccessDoctor;

    public TreatAndUpdateServerModelDoctorImpl()
    {
        dbAccessDoctor = new TreatAndUpdateDBAccessDoctorImpl();
    }

    @Override
    public void addDiagnosisToPatient(Patient patient, Diagnosis diagnosis)
    {
        dbAccessDoctor.addDiagnosisToPatient(patient, diagnosis);
    }

    @Override
    public void treatPatient(Patient patient, Diagnosis diagnosis, Doctor doctor)
    {
        dbAccessDoctor.treatPatient(patient, diagnosis, doctor);
    }

    @Override
    public ArrayList<Diagnosis> getAllDiseasesOfPatient(Patient patient)
    {
        return dbAccessDoctor.getAllDiseasesOfPatient(patient);
    }
}
