package client.networking.doctor;

import shared.Sample;

import java.util.ArrayList;

public class SampleClientDoctorRMI implements SampleClientDoctor
{
  public SampleClientDoctorRMI()
  {
    //
  }

  @Override public ArrayList<Sample> getAllSamples()
  {
    return null;
  }

  @Override public void createSample(Sample sample)
  {

  }

  @Override public void editSample(Sample sample)
  {

  }

  @Override public Sample getSampleByID(int id)
  {
    return null;
  }
}
