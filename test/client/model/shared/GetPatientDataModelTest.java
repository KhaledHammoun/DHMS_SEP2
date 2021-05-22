package client.model.shared;

import client.networking.shared.GetPatientDataClient;
import client.networking.shared.GetPatientDataClientRMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.Patient;
import shared.Sample;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GetPatientDataModelTest
{
  private GetPatientDataModel test;

  @BeforeEach public void setUp()
  {
    GetPatientDataClient client = new GetPatientDataClientRMI();
    test = new GetPatientDataModelImpl(client);
  }

  @Test public void getAllPatients()
  {
    ArrayList<Patient> allPatients = test.getAllPatients();
    assertNotNull(allPatients);
  }

  @Test public void getPatientBySSN()
  {
    Patient patientBySSN = test.getPatientBySSN(9195330945L);
    assertEquals(9195330945L, patientBySSN.getSsn());
  }

  @Test public void getPatientSamples()
  {
    ArrayList<Sample> patientSamples = test.getPatientSamples(9195330945L);

    System.out.println(patientSamples.get(0));

    assertEquals(9195330945L, patientSamples.get(0).getPatient_ssn());
  }

}