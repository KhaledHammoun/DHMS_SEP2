package client.core;

import client.networking.doctor.*;
import client.networking.login.LoginClientImpl;
import client.networking.manager.EmployeeClientRMI;
import client.networking.manager.WardClientRMI;
import client.networking.nurse.AppointmentsClientNurseRMI;
import client.networking.nurse.GetRequiredDataClientNurseRMI;
import client.networking.nurse.PatientClientNurseRMI;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory
{
    private static Map<InterfaceEnum, Object> clients;

    static
    {
        clients = new HashMap<>();
        createLoginClients();
        createManagerClients();
        createDoctorClients();
        createNurseClients();
    }

    private static void createLoginClients()
    {
        clients.put(InterfaceEnum.LOGIN, new LoginClientImpl());
    }

    private static void createManagerClients()
    {
        clients.put(InterfaceEnum.MANAGER_EMPLOYEE, new EmployeeClientRMI());
        clients.put(InterfaceEnum.MANAGER_WARD, new WardClientRMI());
    }

    private static void createDoctorClients()
    {
        clients.put(InterfaceEnum.DOCTOR_APPOINTMENT, new AppointmentsClientDoctorRMI());
        clients.put(InterfaceEnum.DOCTOR_NURSE, new NurseClientDoctorRMI());
        clients.put(InterfaceEnum.DOCTOR_PATIENT, new PatientClientDoctorRMI());
        clients.put(InterfaceEnum.DOCTOR_SAMPLE, new SampleClientDoctorRMI());
        clients.put(InterfaceEnum.DOCTOR_TREAT_UPDATE, new TreatAndUpdateClientDoctorRMI());
    }

    private static void createNurseClients()
    {
        clients.put(InterfaceEnum.NURSE_APPOINTMENT, new AppointmentsClientNurseRMI());
        clients.put(InterfaceEnum.NURSE_GET_DATA, new GetRequiredDataClientNurseRMI());
        clients.put(InterfaceEnum.NURSE_PATIENT, new PatientClientNurseRMI());
    }

    public static Object getClient(InterfaceEnum client)
    {
        return clients.get(client);
    }
}
