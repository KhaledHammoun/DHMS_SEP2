package server.networking.doctor;

import shared.Appointment;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface AppointmentsServerDoctor extends Remote
{
    ArrayList<Appointment> getAllAppointments() throws RemoteException;
    void removeAppointment(Appointment appointment) throws RemoteException;
}
