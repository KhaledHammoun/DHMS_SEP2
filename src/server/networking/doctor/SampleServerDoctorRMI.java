package server.networking.doctor;

import client.model.doctor.PatientModelDoctorImpl;
import client.model.doctor.SampleModelDoctor;
import client.model.doctor.SampleModelDoctorImpl;
import shared.Sample;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class SampleServerDoctorRMI implements SampleServerDoctor
{
    private SampleModelDoctor modelDoctor;

    public SampleServerDoctorRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        modelDoctor = new SampleModelDoctorImpl();
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("SampleServerDoctor", this);
        System.out.println("SampleServerDoctor is running!");
    }

    @Override
    public ArrayList<Sample> getAllSamples()
    {
        return modelDoctor.getAllSamples();
    }

    @Override
    public void createSample(Sample sample)
    {
        modelDoctor.createSample(sample);
    }

    @Override
    public void editSample(Sample sample)
    {
        modelDoctor.editSample(sample);
    }

    @Override
    public Sample getSampleById(int id)
    {
        return modelDoctor.getSampleByID(id);
    }
}
