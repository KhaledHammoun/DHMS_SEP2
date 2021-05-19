package client.networking.doctor;

import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public interface AppointmentsClientDoctor
{
  ArrayList<Appointment> getAllAppointments(Doctor doctor);
  void removeAppointment(Appointment appointment);
}
