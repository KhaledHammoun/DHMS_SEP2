package client.networking.nurse;

import shared.Appointment;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppointmentsClientNurse extends Remote
{
  void createAppointment(Appointment appointment) throws RemoteException;
  void editAppointment(Appointment appointment) throws RemoteException;
}
