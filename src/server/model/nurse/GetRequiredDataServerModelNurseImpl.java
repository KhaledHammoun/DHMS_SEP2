package server.model.nurse;

import server.database.nurse.GetRequiredDataDBAccessNurse;
import server.database.nurse.GetRequiredDataDBAccessNurseImpl;
import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public class GetRequiredDataServerModelNurseImpl implements GetRequiredDataServerModelNurse
{
    private GetRequiredDataDBAccessNurse dbAccessNurse;

    public GetRequiredDataServerModelNurseImpl()
    {
        dbAccessNurse = new GetRequiredDataDBAccessNurseImpl();
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return dbAccessNurse.getAllPatients();
    }

    @Override
    public ArrayList<Doctor> getAllDoctors()
    {
        return dbAccessNurse.getAllDoctors();
    }

    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        return dbAccessNurse.getAllAppointments();
    }
}
