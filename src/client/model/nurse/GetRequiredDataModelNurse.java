package client.model.nurse;

import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public interface GetRequiredDataModelNurse
{
  ArrayList<Patient> getAllPatients();
  ArrayList<Doctor> getAllDoctors();
  ArrayList<Appointment> getAllAppointments();
}
