package server.networking.doctor;

import server.model.doctor.PatientServerModelDoctor;
import server.model.doctor.PatientServerModelDoctorImpl;
import shared.Patient;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class PatientServerDoctorRMI implements PatientServerDoctor
{
    private PatientServerModelDoctor modelDoctor;

    public PatientServerDoctorRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        modelDoctor = new PatientServerModelDoctorImpl();
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("PatientServerDoctor", this);
        System.out.println("PatientServerDoctor is running!");
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return modelDoctor.getAllPatients();
    }

    @Override
    public Patient getPatientBySNN(long SSN)
    {
        return modelDoctor.getPatientBySNN(SSN);
    }
}
