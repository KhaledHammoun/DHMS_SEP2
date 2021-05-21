package client.model.doctor;

import client.networking.doctor.SampleClientDoctor;
import client.networking.doctor.SampleClientDoctorRMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.Sample;

import java.sql.Date;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SampleModelDoctorTest
{
  private SampleModelDoctor test;

  @BeforeEach public void setUp()
  {
    SampleClientDoctor client = new SampleClientDoctorRMI();
    test = new SampleModelDoctorImpl(client);
  }

  @Test public void getAllSamples()
  {
    ArrayList<Sample> allSamples = test.getAllSamples();
    assertNotNull(allSamples);
  }

  @Test public void getSampleByID()
  {
    Sample sample = test.getAllSamples().get(0);
    assertNotNull(sample);

    Sample sampleByID = test.getSampleByID(sample.getSample_id());
    assertEquals(sample.getSample_id(), sampleByID.getSample_id());
  }

  @Test public void editSample()
  {
    Sample beforeSample = test.getAllSamples().get(0);
    beforeSample.setResult("Halabala");

    test.editSample(beforeSample);

    Sample afterSample = test.getSampleByID(beforeSample.getSample_id());
    assertEquals("Halabala", afterSample.getResult());
  }

  @Test public void createSample()
  {
    Sample sampleToCreate = new Sample("DNA", "", 2, new Date(1234783712480L), 6739804525L, 4);
    test.createSample(sampleToCreate);

    assertEquals("Working", "Working");
  }
}