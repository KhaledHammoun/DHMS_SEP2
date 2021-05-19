package client.model.manager;

import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public interface EmployeeModelManager
{
  String addDoctor(Doctor doctor);
  String addNurse(Nurse nurse);
  String editDoctor(Doctor doctor);
  String editNurse(Nurse nurse);
  ArrayList<Doctor> getListOfAllDoctors();
  ArrayList<Nurse> getListOfAllNurses();
  String removeDoctor(Doctor doctor);
  String removeNurse(Nurse nurse);
}
