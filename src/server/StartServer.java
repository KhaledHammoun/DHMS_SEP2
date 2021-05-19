package server;

import client.model.doctor.PatientModelDoctor;
import client.model.doctor.PatientModelDoctorImpl;
import server.networking.doctor.*;
import server.networking.login.LoginServer;
import server.networking.login.LoginServerRMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartServer
{
    public static void main(String[] args) throws RemoteException, AlreadyBoundException
    {
        Registry registry = LocateRegistry.createRegistry(1099);
        //Login server start
        LoginServer loginServer = new LoginServerRMI(registry);

        //Manager server start


        //Doctor server start
        AppointmentsServerDoctor appointmentsServerDoctor = new AppointmentsServerDoctorRMI(registry);
        NursesServerDoctor nursesServerDoctor = new NursesServerDoctorRMI(registry);
        PatientServerDoctor patientServerDoctor = new PatientServerDoctorRMI(registry);
        SampleServerDoctor sampleServerDoctor = new SampleServerDoctorRMI(registry);
        TreatAndUpdateServerDoctor treatAndUpdateServerDoctor = new TreatAndUpdateServerDoctorRMI(registry);

        //Nurse server start
    }

}
