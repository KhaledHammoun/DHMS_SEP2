package client.networking.doctor;

import server.networking.doctor.TreatAndUpdateServerDoctor;
import shared.Diagnosis;
import shared.Doctor;
import shared.Patient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class TreatAndUpdateClientDoctorRMI implements TreatAndUpdateClientDoctor
{
  private TreatAndUpdateServerDoctor serverDoctor;

  public TreatAndUpdateClientDoctorRMI()
  {
    try
    {
      Registry registry = LocateRegistry.getRegistry(1099);
      serverDoctor = (TreatAndUpdateServerDoctor) registry.lookup("TreatAndUpdateServerDoctor");
    }
    catch (RemoteException | NotBoundException e)
    {
      throw new RuntimeException("Could not connect to the server, please try again later");
    }
  }

  @Override public void addDiagnosisToPatient(Patient patient, Diagnosis diagnosis)
  {
    try
    {
      serverDoctor.addDiagnosisToPatient(patient, diagnosis);
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
      serverDoctor.treatPatient(patient, diagnosis, doctor);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while adding patient treatment. Please try again.");
    }
  }

  @Override public ArrayList<Diagnosis> getAllDiseasesOfPatient(Patient patient)
  {
    try
    {
      return serverDoctor.getAllDiseasesOfPatient(patient);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching patient data. Please try again.");
    }
  }
}
