package client.view;

import client.core.InterfaceEnum;

import java.util.List;

public enum View
{
    LOGIN,
    MAIN,
    ADD_EDIT_EMPLOYEE,
    ADD_EDIT_WARD,
    WARD,
    EMPLOYEE,
    SIDEBAR;

    private static final List<View> LOGIN_VALUES = List.of(LOGIN, MAIN);
    private static final List<View> DOCTOR_VALUES = List.of();
    private static final List<View> MANAGER_VALUES = List.of();
    private static final List<View> NURSE_VALUES = List.of();

    public static List<View> getLoginValues()
    {
        return LOGIN_VALUES;
    }

    public static List<View> getDoctorValues()
    {
        return DOCTOR_VALUES;
    }

    public static List<View> getManagerValues()
    {
        return MANAGER_VALUES;
    }

    public static List<View> getNurseValues()
    {
        return NURSE_VALUES;
    }
}
