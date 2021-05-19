package server.networking.doctor;

import shared.Patient;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface PatientServerDoctor extends Remote
{
    ArrayList<Patient> getAllPatients() throws RemoteException;
    Patient getPatientBySNN(int SSN) throws RemoteException;
}
