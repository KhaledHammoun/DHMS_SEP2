package server.database.nurse;

import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public interface GetRequiredDataAccessNurse
{
    ArrayList<Patient> getAllPatients();
    ArrayList<Doctor> getAllDoctors();
    ArrayList<Appointment> getAllAppointments();
}
