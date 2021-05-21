package client.networking.doctor;

import server.networking.doctor.PatientServerDoctor;
import shared.Patient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class PatientClientDoctorRMI implements PatientClientDoctor
{
  private PatientServerDoctor serverDoctor;

  public PatientClientDoctorRMI()
  {
    try
    {
      Registry registry = LocateRegistry.getRegistry(1099);
      serverDoctor = (PatientServerDoctor) registry.lookup("PatientServerDoctor");
    }
    catch (RemoteException | NotBoundException e)
    {
      throw new RuntimeException("Could not connect to the server, please try again later.");
    }
  }

  @Override public ArrayList<Patient> getAllPatients()
  {
    try
    {
      return serverDoctor.getAllPatients();
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching all patients. Please try again.");
    }
  }

  @Override public Patient getPatientBySSN(long ssn)
  {
    try
    {
      return serverDoctor.getPatientBySNN(ssn);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching patient. Please try again.");
    }
  }
}
