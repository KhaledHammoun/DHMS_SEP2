package client.networking.doctor;

import server.networking.doctor.AppointmentsServerDoctor;
import shared.Appointment;
import shared.Doctor;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class AppointmentsClientDoctorRMI implements AppointmentsClientDoctor
{
  private AppointmentsServerDoctor serverDoctor;

  public AppointmentsClientDoctorRMI()
  {
    try
    {
      Registry registry = LocateRegistry.getRegistry(1099);
      serverDoctor = (AppointmentsServerDoctor) registry.lookup("AppointmentsServerDoctor");
    }
    catch (RemoteException | NotBoundException e)
    {
      throw new RuntimeException("Could not connect to the server, please try again later.");
    }
  }

  @Override public ArrayList<Appointment> getAllAppointments(Doctor doctor)
  {
    try
    {
      return serverDoctor.getAllAppointments(doctor);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching all appointments. Please try again.");
    }
  }

  @Override public void removeAppointment(Appointment appointment)
  {
    try
    {
      serverDoctor.removeAppointment(appointment);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while removing appointment. Please try again.");
    }
  }
}
