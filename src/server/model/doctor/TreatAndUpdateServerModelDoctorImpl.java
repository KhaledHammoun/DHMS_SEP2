package server.model.doctor;

import server.database.doctor.TreatAndUpdateDBAccessDoctor;
import server.database.doctor.TreatAndUpdateDBAccessDoctorImpl;
import shared.Disease;
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
    public void addDiagnosisToPatient(Patient patient, Disease disease)
    {
        dbAccessDoctor.addDiagnosisToPatient(patient, disease);
    }

    @Override
    public void treatPatient(Patient patient, Disease disease, Doctor doctor)
    {
        dbAccessDoctor.treatPatient(patient, disease, doctor);
    }

    @Override
    public ArrayList<Disease> getAllDiseasesOfPatient(Patient patient)
    {
        return dbAccessDoctor.getAllDiseasesOfPatient(patient);
    }
}
