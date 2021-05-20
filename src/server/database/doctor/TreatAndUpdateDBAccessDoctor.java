package server.database.doctor;

import shared.Diagnosis;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public interface TreatAndUpdateDBAccessDoctor
{
    void addDiagnosisToPatient(Patient patient, Diagnosis diagnosis);
    void treatPatient(Patient patient, Diagnosis diagnosis, Doctor doctor);
    ArrayList<Diagnosis> getAllDiseasesOfPatient(Patient patient);
}
