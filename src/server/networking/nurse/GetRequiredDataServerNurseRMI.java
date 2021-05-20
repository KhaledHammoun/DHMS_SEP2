package server.networking.nurse;

import server.model.nurse.GetRequiredDataServerModelNurse;
import server.model.nurse.GetRequiredDataServerModelNurseImpl;
import shared.Appointment;
import shared.Doctor;
import shared.Patient;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class GetRequiredDataServerNurseRMI implements GetRequiredDataServerNurse
{
    private GetRequiredDataServerModelNurse modelNurse;

    public GetRequiredDataServerNurseRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        modelNurse = new GetRequiredDataServerModelNurseImpl();
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("GerRequiredDataServer", this);
        System.out.println("GerRequiredDataServer is running.");
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return modelNurse.getAllPatients();
    }

    @Override
    public ArrayList<Doctor> getAllDoctors()
    {
        return modelNurse.getAllDoctors();
    }

    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        return modelNurse.getAllAppointments();
    }
}
