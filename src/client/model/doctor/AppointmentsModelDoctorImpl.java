package client.model.doctor;

import client.networking.doctor.AppointmentsClientDoctor;
import shared.Appointment;
import shared.Doctor;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class AppointmentsModelDoctorImpl implements AppointmentsModelDoctor
{
  private AppointmentsClientDoctor clientDoctor;

  public AppointmentsModelDoctorImpl(Object client)
  {
    clientDoctor = (AppointmentsClientDoctor) client;
  }

  @Override public ArrayList<Appointment> getAllAppointments(Doctor doctor)
  {
    try
    {
      return clientDoctor.getAllAppointments(doctor);
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
      clientDoctor.removeAppointment(appointment);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while removing appointment. Please try again.");
    }
  }
}
