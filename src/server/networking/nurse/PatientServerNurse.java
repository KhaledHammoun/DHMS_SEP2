package server.networking.nurse;

import shared.Patient;

public interface PatientServerNurse
{
    void addPatient(Patient patient);
    void editPatient(Patient patient);
    void removePatient(Patient patient);
    Patient getPatientBySSN(int SSN);
}
