package client.model.doctor;

import client.networking.doctor.TreatAndUpdateClientDoctor;
import shared.Disease;
import shared.Doctor;
import shared.Patient;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class TreatAndUpdateModelDoctorImpl implements TreatAndUpdateModelDoctor
{
 private TreatAndUpdateClientDoctor clientDoctor;

 public TreatAndUpdateModelDoctorImpl(Object client)
 {
   clientDoctor = (TreatAndUpdateClientDoctor) client;
 }

  @Override public void addDiagnosisToPatient(Patient patient, Disease disease)
  {
   try
   {
    clientDoctor.addDiagnosisToPatient(patient, disease);
   }
   catch (RemoteException e)
   {
    throw new RuntimeException("Error while adding patient diagnosis. Please try again.");
   }
  }

  @Override public void treatPatient(Patient patient, Disease disease, Doctor doctor)
  {
   try
   {
    clientDoctor.treatPatient(patient, disease, doctor);
   }
   catch (RemoteException e)
   {
    throw new RuntimeException("Error while adding patient treatment. Please try again.");
   }
  }

  @Override public ArrayList<Disease> getAllDiseaseOfPatient(Patient patient)
  {
   try
   {
    return clientDoctor.getAllDiseasesOfPatient(patient);
   }
   catch (RemoteException e)
   {
    throw new RuntimeException("Error while fetching patient data. Please try again.");
   }
  }
}
