package server.model.shared;

import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public class GetEmployeeDataServerModelImpl implements GetEmployeeDataServerModel
{
    @Override
    public ArrayList<Doctor> getListOfAllDoctors()
    {
        return null;
    }

    @Override
    public ArrayList<Nurse> getListOfAllNurses()
    {
        return null;
    }

    @Override
    public Doctor getDoctorBySSN(long ssn)
    {
        return null;
    }

    @Override
    public Nurse getNurseBySSN(long ssn)
    {
        return null;
    }
}