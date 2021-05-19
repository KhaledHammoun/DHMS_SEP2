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
        models.put(InterfaceEnum.LOGIN, new LoginImpl());
    }

    private static void createManagerModels()
    {
        models.put(InterfaceEnum.MANAGER_EMPLOYEE, new EmployeeModelManagerImpl());
        models.put(InterfaceEnum.MANAGER_WARD, new WardModelManagerImpl());
    }

    private static void createDoctorModels()
    {
        models.put(InterfaceEnum.DOCTOR_APPOINTMENT, new AppointmentsModelDoctorImpl());
        models.put(InterfaceEnum.DOCTOR_NURSE, new NursesModelDoctorImpl());
        models.put(InterfaceEnum.DOCTOR_PATIENT, new PatientModelDoctorImpl());
        models.put(InterfaceEnum.DOCTOR_SAMPLE, new SampleModelDoctorImpl());
        models.put(InterfaceEnum.DOCTOR_TREAT_UPDATE, new TreatAndUpdateModelDoctorImpl());
    }

    private static void createNurseModels()
    {
        models.put(InterfaceEnum.NURSE_APPOINTMENT, new AppointmentsModelNurseImpl());
        models.put(InterfaceEnum.NURSE_GET_DATA, new GetRequiredDataModelNurseImpl());
        models.put(InterfaceEnum.NURSE_PATIENT, new PatientModelNurseImpl());
    }

    public static Object getModel(InterfaceEnum model)
    {
        return models.get(model);
    }
}
