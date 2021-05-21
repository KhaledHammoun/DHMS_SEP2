package server.model.manager;

import server.database.manager.EmployeeDBAccessImpl;
import server.database.manager.EmployeeDBAccessManager;
import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

public class EmployeeServerModelManagerImpl implements EmployeeServerModelManager
{
    private EmployeeDBAccessManager dbAccessManager;

    public EmployeeServerModelManagerImpl()
    {
        dbAccessManager = new EmployeeDBAccessImpl();
    }

    @Override
    public String addDoctor(Doctor doctor)
    {
        return dbAccessManager.addDoctor(doctor);
    }

    @Override
    public String addNurse(Nurse nurse)
    {
        return dbAccessManager.addNurse(nurse);
    }

    @Override
    public String editDoctor(Doctor doctor)
    {
        return dbAccessManager.editDoctor(doctor);
    }

    @Override
    public String editNurse(Nurse nurse)
    {
        return dbAccessManager.editNurse(nurse);
    }

    @Override
    public String removeDoctor(Doctor doctor)
    {
        return dbAccessManager.removeDoctor(doctor);
    }

    @Override
    public String removeNurse(Nurse nurse)
    {
        return dbAccessManager.removeNurse(nurse);
    }
}
