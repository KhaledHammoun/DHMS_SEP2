package server.model.doctor;

import server.database.doctor.AppointmentsDBAccessDoctor;
import server.database.doctor.AppointmentsDBAccessDoctorImpl;
import shared.Appointment;

import java.util.ArrayList;

public class AppointmentsServerModelDoctorImpl implements AppointmentsServerModelDoctor
{
    private AppointmentsDBAccessDoctor dbAccessDoctor;

    public AppointmentsServerModelDoctorImpl()
    {
        dbAccessDoctor = new AppointmentsDBAccessDoctorImpl();
    }

    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        return dbAccessDoctor.getAllAppointments();
    }

    @Override
    public void removeAppointment(Appointment appointment)
    {
        dbAccessDoctor.removeAppointment(appointment);
    }
}
