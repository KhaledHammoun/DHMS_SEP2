package server;

import client.model.doctor.PatientModelDoctor;
import client.model.doctor.PatientModelDoctorImpl;
import server.networking.doctor.*;
import server.networking.login.LoginServer;
import server.networking.login.LoginServerRMI;
import server.networking.manager.EmployeeServerManager;
import server.networking.manager.EmployeeServerManagerRMI;
import server.networking.manager.WardServerManager;
import server.networking.manager.WardServerManagerRMI;
import server.networking.nurse.*;

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
        System.out.println();

        //Manager server start
        EmployeeServerManager employeeServerManager = new EmployeeServerManagerRMI(registry);
        WardServerManager serverManager = new WardServerManagerRMI(registry);
        System.out.println();

        //Doctor server start
        AppointmentsServerDoctor appointmentsServerDoctor = new AppointmentsServerDoctorRMI(registry);
        NursesServerDoctor nursesServerDoctor = new NursesServerDoctorRMI(registry);
        PatientServerDoctor patientServerDoctor = new PatientServerDoctorRMI(registry);
        SampleServerDoctor sampleServerDoctor = new SampleServerDoctorRMI(registry);
        TreatAndUpdateServerDoctor treatAndUpdateServerDoctor = new TreatAndUpdateServerDoctorRMI(registry);
        System.out.println();

        //Nurse server start
        AppointmentsServerNurse appointmentsServerNurse = new AppointmentsServerNurseRMI(registry);
        GetRequiredDataServerNurse getRequiredDataServerNurse = new GetRequiredDataServerNurseRMI(registry);
        PatientServerNurse patientServerNurse = new PatientServerNurseRMI(registry);
    }

}
