package client.networking.doctor;

import shared.Sample;

import java.util.ArrayList;

public interface SampleClientDoctor
{
  ArrayList<Sample> getAllSamples();
  void createSample(Sample sample);
  void editSample(Sample sample);
  Sample getSampleByID(int id);
}
