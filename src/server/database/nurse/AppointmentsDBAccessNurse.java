package server.database.nurse;

import shared.Patient;

public interface AppointmentsDBAccessNurse
{
    void addPatient(Patient patient);
    void editPatient(Patient patient);
    void removePatient(Patient patient);
    Patient getPatientBySNN(int SNN);
}
