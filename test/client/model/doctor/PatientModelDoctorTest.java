package client.model.doctor;

import client.networking.doctor.PatientClientDoctor;
import client.networking.doctor.PatientClientDoctorRMI;
import org.junit.jupiter.api.Test;
import shared.Patient;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class PatientModelDoctorTest
{

  @Test public void getAllPatients()
  {
    PatientClientDoctor client = new PatientClientDoctorRMI();
    PatientModelDoctor test = new PatientModelDoctorImpl(client);
    ArrayList<Patient> allPatients = test.getAllPatients();

    assertNotEquals(null, allPatients);
  }

  @Test public void getPatientBySsn()
  {
    PatientClientDoctor client = new PatientClientDoctorRMI();
    PatientModelDoctor test = new PatientModelDoctorImpl(client);
    ArrayList<Patient> allPatients = test.getAllPatients();
    assertNotEquals(0, allPatients.size());

    long patientSsn = 6098121727L;
    Patient patientBySSN = test.getPatientBySSN(patientSsn);

    assertEquals(patientSsn, patientBySSN.getSsn());

  }
}