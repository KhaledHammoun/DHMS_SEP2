package client.model.doctor;

import client.networking.doctor.TreatAndUpdateClientDoctor;
import shared.Diagnosis;
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

  @Override public void addDiagnosisToPatient(Patient patient, Diagnosis diagnosis)
  {
   try
   {
    clientDoctor.addDiagnosisToPatient(patient, diagnosis);
   }
   catch (RemoteException e)
   {
    throw new RuntimeException("Error while adding patient diagnosis. Please try again.");
   }
  }

  @Override public void treatPatient(Patient patient, Diagnosis diagnosis, Doctor doctor)
  {
   try
   {
    clientDoctor.treatPatient(patient, diagnosis, doctor);
   }
   catch (RemoteException e)
   {
    throw new RuntimeException("Error while adding patient treatment. Please try again.");
   }
  }

  @Override public ArrayList<Diagnosis> getAllDiseaseOfPatient(Patient patient)
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
