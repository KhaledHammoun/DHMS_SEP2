package client.networking.doctor;

import shared.Disease;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public interface TreatAndUpdateClientDoctor
{
 void addDiagnosisToPatient(Patient patient, Disease disease);
 void treatPatient(Patient patient,Disease disease, Doctor doctor);
 ArrayList<Disease> getAllDiseasesOfPatient(Patient patient);
}
