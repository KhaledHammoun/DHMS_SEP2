package client.networking.doctor;

import shared.Disease;
import shared.Doctor;
import shared.Patient;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface TreatAndUpdateClientDoctor extends Remote
{
    void addDiagnosisToPatient(Patient patient, Disease disease) throws RemoteException;
    void treatPatient(Patient patient, Disease disease, Doctor doctor) throws RemoteException;
    ArrayList<Disease> getAllDiseasesOfPatient(Patient patient) throws RemoteException;
}
