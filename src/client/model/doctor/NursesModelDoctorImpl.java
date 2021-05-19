package client.model.doctor;

import client.networking.doctor.NurseClientDoctor;
import shared.Doctor;
import shared.Nurse;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class NursesModelDoctorImpl implements NursesModelDoctor
{
  private NurseClientDoctor clientDoctor;

  public NursesModelDoctorImpl(Object client)
  {
    clientDoctor = (NurseClientDoctor) client;
  }

  @Override public ArrayList<Nurse> getAllAvailableNurses()
  {
    try
    {
      return clientDoctor.getAllAvailableNurses();
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching all nurses. Please try again.");
    }
  }

  @Override public void assignNurse(Nurse nurse, Doctor doctor)
  {
    try
    {
      clientDoctor.assignNurse(nurse, doctor);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while assigning nurse. Please try again.");
    }
  }

  @Override public ArrayList<Nurse> getAllNursesAssignedToMe(Doctor doctor)
  {
    try
    {
      return clientDoctor.getAllNursesAssignedToMe(doctor);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching all nurses. Please try again.");
    }
  }
}
