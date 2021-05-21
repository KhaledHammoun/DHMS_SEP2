package client.model.manager;

import client.networking.manager.EmployeeClientManager;
import shared.Doctor;
import shared.Nurse;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class EmployeeModelManagerImpl implements EmployeeModelManager
{
    private EmployeeClientManager clientManager;

    public EmployeeModelManagerImpl(Object client)
    {
        clientManager = (EmployeeClientManager) client;
    }

    @Override
    public String addDoctor(Doctor doctor)
    {
        try
        {
            return clientManager.addDoctor(doctor);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while adding doctor to the system. Please try again.");
        }
    }

    @Override
    public String addNurse(Nurse nurse)
    {
        try
        {
            return clientManager.addNurse(nurse);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while adding nurse to the system. Please try again.");
        }
    }

    @Override
    public String editDoctor(Doctor doctor)
    {
        try
        {
            return clientManager.editDoctor(doctor);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while editing doctor to the system. Please try again.");
        }
    }

    @Override
    public String editNurse(Nurse nurse)
    {
        try
        {
            return clientManager.editNurse(nurse);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while editing nurse to the system. Please try again.");
        }
    }

    @Override
    public String removeDoctor(Doctor doctor)
    {
        try
        {
            return clientManager.removeDoctor(doctor);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while removing doctor from the system. Please try again.");
        }
    }

    @Override
    public String removeNurse(Nurse nurse)
    {
        try
        {
            return clientManager.removeNurse(nurse);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while removing nurse from the system. Please try again.");
        }
    }
}
