package client.model.doctor;

import shared.Patient;

import java.util.ArrayList;

public interface PatientModelDoctor
{
  ArrayList<Patient> getAllPatients();
  Patient getPatientBySSN(long ssn);
}
