package server.networking.doctor;

import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public class NursesServerDoctorRMI implements NursesServerDoctor
{
    public NursesServerDoctorRMI()
    {

    }

    @Override
    public ArrayList<Nurse> getAllAvailableNurses()
    {
        return null;
    }

    @Override
    public void assignNurse(Nurse nurse, Doctor doctor)
    {

    }

    @Override
    public ArrayList<Nurse> getAllNursesAssignedToMe(Doctor doctor)
    {
        return null;
    }
}
