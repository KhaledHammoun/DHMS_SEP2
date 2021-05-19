package client.networking.nurse;

import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public interface GetRequiredDataClientNurse
{
  ArrayList<Patient> getAllPatients();
  ArrayList<Doctor> getAllDoctors();
  ArrayList<Appointment> getAllAppointments();
}
