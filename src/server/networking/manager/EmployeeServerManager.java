package server.networking.manager;

import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public interface EmployeeServerManager
{
    String addDoctor(Doctor doctor);
    String addNurse(Nurse nurse);
    String editDoctor(Doctor doctor);
    String editNurse(Nurse nurse);
    ArrayList<Doctor> getAllDoctors();
    ArrayList<Nurse> getAllNurses();
    String removeDoctor(Doctor doctor);
    String removeNurse(Nurse nurse);
}
