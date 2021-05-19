package client.networking.doctor;

import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public class NurseClientDoctorRMI implements NurseClientDoctor
{
  public NurseClientDoctorRMI()
  {
    //
  }

  @Override public ArrayList<Nurse> getAllAvailableNurses()
  {
    return null;
  }

  @Override public void assignNurse(Nurse nurse, Doctor doctor)
  {

  }

  @Override public ArrayList<Nurse> getAllNursesAssignedToMe(Doctor doctor)
  {
    return null;
  }
}
