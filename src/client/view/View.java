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

    private static final List<View> VALUES = List.of(values());

    public static List<View> getViewEnums()
    {
        return VALUES;
    }
}
