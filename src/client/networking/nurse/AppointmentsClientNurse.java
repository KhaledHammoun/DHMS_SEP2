package client.networking.nurse;

import shared.Appointment;

public interface AppointmentsClientNurse
{
  void createAppointment(Appointment appointment);
  void editAppointment(Appointment appointment);
}
