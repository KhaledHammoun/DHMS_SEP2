package server.networking.doctor;

import client.model.doctor.NursesModelDoctor;
import client.model.doctor.NursesModelDoctorImpl;
import server.model.doctor.AppointmentsServerModelDoctorImpl;
import shared.Doctor;
import shared.Nurse;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class NursesServerDoctorRMI implements NursesServerDoctor
{
    private NursesModelDoctor modelDoctor;

    public NursesServerDoctorRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        modelDoctor = new NursesModelDoctorImpl();
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("NursesServerDoctor", this);
        System.out.println("NursesServerDoctor is running!");
    }

    @Override
    public ArrayList<Nurse> getAllAvailableNurses()
    {
        return modelDoctor.getAllAvailableNurses();
    }

    @Override
    public void assignNurse(Nurse nurse, Doctor doctor)
    {
        modelDoctor.assignNurse(nurse, doctor);
    }

    @Override
    public ArrayList<Nurse> getAllNursesAssignedToMe(Doctor doctor)
    {
        return modelDoctor.getAllNursesAssignedToMe(doctor);
    }
}
