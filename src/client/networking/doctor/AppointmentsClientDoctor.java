package client.networking.doctor;

import shared.Appointment;
import shared.Doctor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface AppointmentsClientDoctor extends Remote
{
  ArrayList<Appointment> getAllAppointments(Doctor doctor) throws RemoteException;
  void removeAppointment(Appointment appointment) throws RemoteException;
}
