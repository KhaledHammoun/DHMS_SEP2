package client.model.doctor;

import client.networking.doctor.SampleClientDoctor;
import shared.Patient;
import shared.Sample;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class SampleModelDoctorImpl implements SampleModelDoctor
{
  private SampleClientDoctor clientDoctor;

  public SampleModelDoctorImpl(Object client)
  {
    clientDoctor = (SampleClientDoctor) client;
  }

  @Override public ArrayList<Sample> getAllSamples()
  {
    try
    {
      return clientDoctor.getAllSamples();
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching all samples. Please try again.");
    }
  }

  @Override public void createSample(Sample sample)
  {
    try
    {
      clientDoctor.createSample(sample);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while creating sample. Please try again.");
    }
  }

  @Override public void editSample(Sample sample)
  {
    try
    {
      clientDoctor.editSample(sample);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while editing sample. Please try again.");
    }
  }

  @Override public Sample getSampleByID(int id)
  {
    try
    {
      return clientDoctor.getSampleByID(id);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching sample. Please try again.");
    }
  }

  @Override public ArrayList<Sample> getAllPatientSamples(Patient patient)
  {
    try
    {
      return clientDoctor.getAllPatientSamples(patient);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching samples. Please try again.");
    }
  }
}
