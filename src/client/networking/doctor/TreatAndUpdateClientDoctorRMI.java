package client.networking.doctor;

import shared.Disease;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public class TreatAndUpdateClientDoctorRMI implements TreatAndUpdateClientDoctor
{
  public TreatAndUpdateClientDoctorRMI()
  {
    //
  }

  @Override public void addDiagnosisToPatient(Patient patient, Disease disease)
  {

  }

  @Override public void treatPatient(Patient patient, Disease disease, Doctor doctor)
  {

  }

  @Override public ArrayList<Disease> getAllDiseasesOfPatient(Patient patient)
  {
    return null;
  }
}
