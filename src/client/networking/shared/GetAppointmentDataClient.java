package client.networking.shared;

import shared.Appointment;
import shared.Doctor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface GetAppointmentDataClient extends Remote
{
    ArrayList<Appointment> getAllAppointments() throws RemoteException;
    Appointment getAppointmentForDoctor(Doctor doctor) throws RemoteException;
    Appointment getAppointment(Appointment appointment) throws RemoteException;
}
