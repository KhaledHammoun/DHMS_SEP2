package client.view;

import shared.CamelCaseConverter;

import java.util.ArrayList;
import java.util.List;

public enum View
{
    //Login
    LOGIN,
    MANAGER_MAIN,
    DOCTOR_MAIN,
    NURSE_MAIN,
    //Doctor
    ADD_EDIT_SAMPLE,
    APPOINTMENTS,
    ASSIGN_NURSE,
    ADD_DIAGNOSIS,
    PATIENTS_SAMPLES,
    EDIT_MEDICAL_DESCRIPTION,
    PATIENTS,
    TREAT_PATIENT,
    //Manager
    ADD_EDIT_EMPLOYEE,
    ADD_EDIT_WARD,
    WARD,
    EMPLOYEE,
    //Nurse
    ALL_APPOINTMENTS,
    MAKE_APPOINTMENT,
    ADD_PATIENT;


    private static final List<String> LOGIN_VALUES;
    private static final List<String> DOCTOR_VALUES;
    ;
    private static final List<String> MANAGER_VALUES;
    private static final List<String> NURSE_VALUES;

    static
    {
        LOGIN_VALUES = convertLoginValues();
        DOCTOR_VALUES = convertDoctorValues();
        MANAGER_VALUES = convertManagerValues();
        NURSE_VALUES = convertNurseValues();
    }

    public static List<String> getLoginValues()
    {
        return LOGIN_VALUES;
    }

    public static List<String> getDoctorValues()
    {
        return DOCTOR_VALUES;
    }

    public static List<String> getManagerValues()
    {
        return MANAGER_VALUES;
    }

    public static List<String> getNurseValues()
    {
        return NURSE_VALUES;
    }

    private static List<String> convertLoginValues()
    {
        View[] views = {LOGIN, MANAGER_MAIN, DOCTOR_MAIN, NURSE_MAIN};
        ArrayList<String> toReturn = new ArrayList<>();

        for (View view : views)
        {
            toReturn.add(CamelCaseConverter.toCamelCase(view.name()));
        }
        return toReturn;
    }

    private static List<String> convertDoctorValues()
    {
        View[] views =
                {ADD_EDIT_SAMPLE, APPOINTMENTS, ASSIGN_NURSE, ADD_DIAGNOSIS, PATIENTS_SAMPLES, EDIT_MEDICAL_DESCRIPTION,
                 PATIENTS, TREAT_PATIENT};
        ArrayList<String> toReturn = new ArrayList<>();

        for (View view : views)
        {
            toReturn.add(CamelCaseConverter.toCamelCase(view.name()));
        }
        return toReturn;
    }

    private static List<String> convertManagerValues()
    {
        View[] views = {ADD_EDIT_EMPLOYEE, ADD_EDIT_WARD, WARD, EMPLOYEE};
        ArrayList<String> toReturn = new ArrayList<>();

        for (View view : views)
        {
            toReturn.add(CamelCaseConverter.toCamelCase(view.name()));
        }
        return toReturn;
    }

    private static List<String> convertNurseValues()
    {
        View[] views = {ALL_APPOINTMENTS, MAKE_APPOINTMENT, ADD_PATIENT};
        ArrayList<String> toReturn = new ArrayList<>();

        for (View view : views)
        {
            toReturn.add(CamelCaseConverter.toCamelCase(view.name()));
        }
        return toReturn;
    }
}
