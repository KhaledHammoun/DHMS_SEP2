package server.model.nurse;

import shared.Patient;

public interface AppointmentsServerModelNurse
{
    void addPatient(Patient patient);
    void editPatient(Patient patient);
    void removePatient(Patient patient);
    Patient getPatientBySNN(int SNN);
}
