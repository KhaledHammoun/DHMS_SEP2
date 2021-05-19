package server.model.doctor;

import server.database.doctor.NursesDBAccessDoctor;
import server.database.doctor.NursesDBAccessDoctorImpl;
import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public class NursesServerModelDoctorImpl implements NursesServerModelDoctor
{
    private NursesDBAccessDoctor dbAccessDoctor;

    public NursesServerModelDoctorImpl()
    {
        dbAccessDoctor = new NursesDBAccessDoctorImpl();
    }

    @Override
    public ArrayList<Nurse> getAllAvailableNurses()
    {
        return dbAccessDoctor.getAllAvailableNurses();
    }

    @Override
    public void assignNurse(Nurse nurse, Doctor doctor)
    {
        dbAccessDoctor.assignNurse(nurse, doctor);
    }

    @Override
    public ArrayList<Nurse> getAllNursesAssignedToMe(Doctor doctor)
    {
        return dbAccessDoctor.getAllNursesAssignedToMe(doctor);
    }
}
