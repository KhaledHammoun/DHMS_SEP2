package client.core;

import client.model.doctor.*;
import client.model.login.LoginImpl;
import client.model.manager.EmployeeModelManagerImpl;
import client.model.manager.WardModelManagerImpl;
import client.model.nurse.AppointmentsModelNurseImpl;
import client.model.nurse.GetRequiredDataModelNurseImpl;
import client.model.nurse.PatientModelNurseImpl;

import java.util.HashMap;
import java.util.Map;

public class ModelFactory
{
    private static Map<InterfaceEnum, Object> models;

    static
    {
        models = new HashMap<>();
        createLoginModels();
        createManagerModels();
        createDoctorModels();
        createNurseModels();
    }

    private static void createLoginModels()
    {
        models.put(InterfaceEnum.LOGIN, new LoginImpl(ClientFactory.getClient(InterfaceEnum.LOGIN)));
    }

    private static void createManagerModels()
    {
        models.put(InterfaceEnum.MANAGER_EMPLOYEE, new EmployeeModelManagerImpl(ClientFactory.getClient(InterfaceEnum.MANAGER_EMPLOYEE)));
        models.put(InterfaceEnum.MANAGER_WARD, new WardModelManagerImpl(ClientFactory.getClient(InterfaceEnum.MANAGER_WARD)));
    }

    private static void createDoctorModels()
    {
        models.put(InterfaceEnum.DOCTOR_APPOINTMENT, new AppointmentsModelDoctorImpl(ClientFactory.getClient(InterfaceEnum.DOCTOR_APPOINTMENT)));
        models.put(InterfaceEnum.DOCTOR_NURSE, new NursesModelDoctorImpl(ClientFactory.getClient(InterfaceEnum.DOCTOR_NURSE)));
        models.put(InterfaceEnum.DOCTOR_PATIENT, new PatientModelDoctorImpl(ClientFactory.getClient(InterfaceEnum.DOCTOR_PATIENT)));
        models.put(InterfaceEnum.DOCTOR_SAMPLE, new SampleModelDoctorImpl(ClientFactory.getClient(InterfaceEnum.DOCTOR_SAMPLE)));
        models.put(InterfaceEnum.DOCTOR_TREAT_UPDATE, new TreatAndUpdateModelDoctorImpl(ClientFactory.getClient(InterfaceEnum.DOCTOR_TREAT_UPDATE)));
    }

    private static void createNurseModels()
    {
        models.put(InterfaceEnum.NURSE_APPOINTMENT, new AppointmentsModelNurseImpl(ClientFactory.getClient(InterfaceEnum.NURSE_APPOINTMENT)));
        models.put(InterfaceEnum.NURSE_GET_DATA, new GetRequiredDataModelNurseImpl(ClientFactory.getClient(InterfaceEnum.NURSE_GET_DATA)));
        models.put(InterfaceEnum.NURSE_PATIENT, new PatientModelNurseImpl(ClientFactory.getClient(InterfaceEnum.NURSE_PATIENT)));
    }

    public static Object getModel(InterfaceEnum model)
    {
        return models.get(model);
    }
}
