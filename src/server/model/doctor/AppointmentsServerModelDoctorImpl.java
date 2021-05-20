package server.model.doctor;

import server.database.doctor.AppointmentsDBAccessDoctor;
import server.database.doctor.AppointmentsDBAccessDoctorImpl;
import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

public class AppointmentsServerModelDoctorImpl implements AppointmentsServerModelDoctor
{
    private AppointmentsDBAccessDoctor dbAccessDoctor;

    public AppointmentsServerModelDoctorImpl()
    {
        dbAccessDoctor = new AppointmentsDBAccessDoctorImpl();
    }

    @Override
    public ArrayList<Appointment> getAllAppointments(Doctor doctor)
    {
        return dbAccessDoctor.getAllAppointments(doctor);
    }

    @Override
    public void removeAppointment(Appointment appointment)
    {
        dbAccessDoctor.removeAppointment(appointment);
    }
}
