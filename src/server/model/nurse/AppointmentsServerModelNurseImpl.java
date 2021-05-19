package server.model.nurse;

import server.database.nurse.AppointmentsDBAccessNurse;
import server.database.nurse.AppointmentsDBAccessNurseImpl;
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
    public void addPatient(Patient patient)
    {
        dbAccessNurse.addPatient(patient);
    }

    @Override
    public void editPatient(Patient patient)
    {
        dbAccessNurse.editPatient(patient);
    }

    @Override
    public void removePatient(Patient patient)
    {
        dbAccessNurse.removePatient(patient);
    }

    @Override
    public Patient getPatientBySNN(int SSN)
    {
        return dbAccessNurse.getPatientBySNN(SSN);
    }
}
