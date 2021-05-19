package client.networking.nurse;

import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public class GetRequiredDataClientNurseRMI implements GetRequiredDataClientNurse
{
  public GetRequiredDataClientNurseRMI()
  {
    //
  }

  @Override public ArrayList<Patient> getAllPatients()
  {
    return null;
  }

  @Override public ArrayList<Doctor> getAllDoctors()
  {
    return null;
  }

  @Override public ArrayList<Appointment> getAllAppointments()
  {
    return null;
  }
}
