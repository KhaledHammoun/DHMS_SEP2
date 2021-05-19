package server.networking.manager;

import client.model.manager.EmployeeModelManager;
import server.model.manager.EmployeeServerModelManager;
import server.model.manager.EmployeeServerModelManagerImpl;
import shared.Doctor;
import shared.Nurse;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class EmployeeServerManagerRMI implements EmployeeServerManager
{
    private EmployeeServerModelManager modelManager;

    public EmployeeServerManagerRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        modelManager = new EmployeeServerModelManagerImpl();
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("EmployeeServerManager", this);
        System.out.println("EmployeeServerManager is running.");
    }

    @Override
    public String addDoctor(Doctor doctor)
    {
        return modelManager.addDoctor(doctor);
    }

    @Override
    public String addNurse(Nurse nurse)
    {
        return modelManager.addNurse(nurse);
    }

    @Override
    public String editDoctor(Doctor doctor)
    {
        return modelManager.editDoctor(doctor);
    }

    @Override
    public String editNurse(Nurse nurse)
    {
        return modelManager.editNurse(nurse);
    }

    @Override
    public ArrayList<Doctor> getAllDoctors()
    {
        return modelManager.getAllDoctors();
    }

    @Override
    public ArrayList<Nurse> getAllNurses()
    {
        return modelManager.getAllNurses();
    }

    @Override
    public String removeDoctor(Doctor doctor)
    {
        return modelManager.removeDoctor(doctor);
    }

    @Override
    public String removeNurse(Nurse nurse)
    {
        return modelManager.removeNurse(nurse);
    }
}
