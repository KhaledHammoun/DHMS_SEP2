package server.networking.nurse;

import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface GetRequiredDataServerNurse extends Remote
{
    ArrayList<Patient> getAllPatients() throws RemoteException;
    ArrayList<Doctor> getAllDoctors() throws RemoteException;
    ArrayList<Appointment> getAllAppointments() throws RemoteException;
}
