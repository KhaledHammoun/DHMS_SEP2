package server.database.nurse;

import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.util.ArrayList;

public interface GetRequiredDataDBAccessNurse
{
    ArrayList<Patient> getAllPatients();
    ArrayList<Doctor> getAllDoctors();
    ArrayList<Appointment> getAllAppointments();
}
