package client.networking.doctor;

import shared.Patient;

import java.util.ArrayList;

public class PatientClientDoctorRMI implements PatientClientDoctor
{

  public PatientClientDoctorRMI()
  {
    //
  }

  @Override public ArrayList<Patient> getAllPatients()
  {
    return null;
  }

  @Override public Patient getPatientBySSN(int ssn)
  {
    return null;
  }
}
