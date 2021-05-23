package client.model.doctor;

import client.networking.doctor.TreatAndUpdateClientDoctor;
import shared.Diagnosis;
import shared.Doctor;
import shared.Patient;
import shared.Treatment;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class TreatAndUpdateModelDoctorImpl implements TreatAndUpdateModelDoctor
{
  private TreatAndUpdateClientDoctor clientDoctor;

  public TreatAndUpdateModelDoctorImpl(Object client)
  {
    clientDoctor = (TreatAndUpdateClientDoctor) client;
  }

  @Override public void addDiagnosisToPatient(Patient patient,
      Diagnosis diagnosis)
  {
    try
    {
      clientDoctor.addDiagnosisToPatient(patient, diagnosis);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException(
          "Error while adding patient diagnosis. Please try again.");
    }
  }

  @Override public void treatPatient(Patient patient, Diagnosis diagnosis,
      Doctor doctor, Treatment treatment)
  {
    try
    {
      clientDoctor.treatPatient(patient, diagnosis, doctor, treatment);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException(
          "Error while adding patient treatment. Please try again.");
    }
  }

  @Override public ArrayList<Diagnosis> getAllDiagnosisOfPatient(
      Patient patient)
  {
    try
    {
      return clientDoctor.getAllDiseasesOfPatient(patient);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException(
          "Error while fetching patient data. Please try again.");
    }
  }

  @Override public void editDiagnosis(Diagnosis diagnosis)
  {
    try
    {
      clientDoctor.editDiagnosis(diagnosis);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException(
          "Error while fetching patient data. Please try again.");
    }
  }

  @Override public ArrayList<Treatment> getAllTreatmentsOfPatient(
      Patient patient, Doctor doctor)
  {
    try
    {
      return clientDoctor.getAllTreatmentsOfPatient(patient, doctor);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException(
          "Error while fetching patient treatments. Please try again.");
    }
  }
}
