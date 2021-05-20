package server.model.nurse;

import server.database.nurse.AppointmentsDBAccessNurse;
import server.database.nurse.AppointmentsDBAccessNurseImpl;
import shared.Appointment;
import shared.Patient;

import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLContext;

public class AppointmentsServerModelNurseImpl implements AppointmentsServerModelNurse
{
    private AppointmentsDBAccessNurse dbAccessNurse;

    public AppointmentsServerModelNurseImpl()
    {
        dbAccessNurse = new AppointmentsDBAccessNurseImpl();
    }


    @Override
    public void createAppointment(Appointment appointment)
    {
        dbAccessNurse.createAppointment(appointment);
    }

    @Override
    public void removeAppointment(Appointment appointment)
    {
        dbAccessNurse.removeAppointment(appointment);
    }
}
