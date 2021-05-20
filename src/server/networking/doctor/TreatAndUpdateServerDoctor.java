package server.networking.doctor;

import shared.Diagnosis;
import shared.Doctor;
import shared.Patient;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface TreatAndUpdateServerDoctor extends Remote
{
    void addDiagnosisToPatient(Patient patient, Diagnosis diagnosis) throws RemoteException;
    void treatPatient(Patient patient, Diagnosis diagnosis, Doctor doctor) throws RemoteException;
    ArrayList<Diagnosis> getAllDiseasesOfPatient(Patient patient) throws RemoteException;
}
