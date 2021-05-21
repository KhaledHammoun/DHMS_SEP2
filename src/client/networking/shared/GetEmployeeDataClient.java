package client.networking.shared;

import shared.Doctor;
import shared.Nurse;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface GetEmployeeDataClient extends Remote
{
    ArrayList<Doctor> getListOfAllDoctors() throws RemoteException;
    ArrayList<Nurse> getListOfAllNurses() throws RemoteException;
    Doctor getDoctorBySSN(long ssn) throws RemoteException;
    Nurse getNurseBySSN(long ssn) throws RemoteException;
}
