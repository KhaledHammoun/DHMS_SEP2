package server.model.nurse;

import server.database.nurse.PatientDBAccessNurse;
import server.database.nurse.PatientDBAccessNurseImpl;
import shared.Patient;

public class PatientServerModelNurseImpl implements PatientServerModelNurse
{
    private PatientDBAccessNurse dbAccessNurse;

    public PatientServerModelNurseImpl()
    {
        dbAccessNurse = new PatientDBAccessNurseImpl();
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
    public Patient getPatientBySSN(long SSN)
    {
        return dbAccessNurse.getPatientBySSN(SSN);
    }
}
