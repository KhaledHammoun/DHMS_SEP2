package client.model.doctor;

import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public class NursesModelDoctorImpl implements NursesModelDoctor
{

  public NursesModelDoctorImpl()
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
