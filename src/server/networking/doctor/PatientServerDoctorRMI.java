package server.networking.doctor;

import client.core.ClientFactory;
import client.core.InterfaceEnum;
import client.model.doctor.PatientModelDoctor;
import client.model.doctor.PatientModelDoctorImpl;
import shared.Patient;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class PatientServerDoctorRMI implements PatientServerDoctor
{
    private PatientModelDoctor modelDoctor;

    public PatientServerDoctorRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        modelDoctor = new PatientModelDoctorImpl(ClientFactory.getClient(InterfaceEnum.DOCTOR_PATIENT));
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
    public Patient getPatientBySNN(int SSN)
    {
        return modelDoctor.getPatientBySSN(SSN);
    }
}
