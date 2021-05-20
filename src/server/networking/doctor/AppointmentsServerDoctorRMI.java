package server.networking.doctor;

import server.model.doctor.AppointmentsServerModelDoctor;
import server.model.doctor.AppointmentsServerModelDoctorImpl;
import shared.Appointment;
import shared.Doctor;

import javax.print.Doc;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class AppointmentsServerDoctorRMI implements AppointmentsServerDoctor
{
    private AppointmentsServerModelDoctor modelDoctor;

    public AppointmentsServerDoctorRMI(Registry registry) throws RemoteException, AlreadyBoundException
    {
        modelDoctor = new AppointmentsServerModelDoctorImpl();
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("AppointmentsServerDoctor", this);
        System.out.println("AppointmentsServerDoctor is running!");
    }

    @Override
    public ArrayList<Appointment> getAllAppointments(Doctor doctor)
    {
        return modelDoctor.getAllAppointments(doctor);
    }

    @Override
    public void removeAppointment(Appointment appointment)
    {
        modelDoctor.removeAppointment(appointment);
    }
}
