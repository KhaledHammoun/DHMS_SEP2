package client.networking.doctor;

import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public class AppointmentsClientDoctorRMI implements AppointmentsClientDoctor
{
  public AppointmentsClientDoctorRMI()
  {
    //
  }

  @Override public ArrayList<Appointment> getAllAppointments(Doctor doctor)
  {
    return null;
  }

  @Override public void removeAppointment(Appointment appointment)
  {

  }
}
