package server.networking.nurse;

import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public class GetRequiredDataServerNurseRMI implements GetRequiredDataServerNurse
{
    public GetRequiredDataServerNurseRMI()
    {

    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return null;
    }

    @Override
    public ArrayList<Doctor> getAllDoctors()
    {
        return null;
    }

    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        return null;
    }
}
