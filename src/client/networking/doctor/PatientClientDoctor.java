package client.networking.doctor;

import shared.Patient;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface PatientClientDoctor extends Remote
{
  ArrayList<Patient> getAllPatients() throws RemoteException;
  Patient getPatientBySSN(long ssn) throws RemoteException;
}
