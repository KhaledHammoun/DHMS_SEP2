package client.networking.doctor;

import shared.Patient;

import java.util.ArrayList;

public interface PatientClientDoctor
{
  ArrayList<Patient> getAllPatients();
  Patient getPatientBySSN(int ssn);
}
