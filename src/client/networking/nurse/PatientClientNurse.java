package client.networking.nurse;

import shared.Patient;

public interface PatientClientNurse
{
  void addPatient(Patient patient);
  void editPatient(Patient patient);
  void removePatient(Patient patient);
  Patient getPatientBySSN(int ssn);

}
