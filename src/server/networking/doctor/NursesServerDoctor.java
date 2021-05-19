package server.networking.doctor;

import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public interface NursesServerDoctor
{
    ArrayList<Nurse> getAllAvailableNurses();
    void assignNurse(Nurse nurse, Doctor doctor);
    ArrayList<Nurse> getAllNursesAssignedToMe(Doctor doctor);
}
