package client.model.doctor;

import client.networking.doctor.PatientClientDoctor;
import shared.Patient;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class PatientModelDoctorImpl implements PatientModelDoctor
{
  private PatientClientDoctor clientDoctor;

  public PatientModelDoctorImpl(Object client)
  {
    clientDoctor = (PatientClientDoctor) client;
  }

  @Override public ArrayList<Patient> getAllPatients()
  {
    try
    {
      return clientDoctor.getAllPatients();
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
      return clientDoctor.getPatientBySSN(ssn);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching patient. Please try again.");
    }
  }
}
