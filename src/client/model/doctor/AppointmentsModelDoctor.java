package client.model.doctor;

import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public interface AppointmentsModelDoctor
{
  ArrayList<Appointment> getAllAppointments(Doctor doctor);
  void removeAppointment(Appointment appointment);
}
