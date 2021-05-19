package server.database.manager;

import shared.Ward;

import java.util.ArrayList;

public interface WardDBAccessManager
{
    void addWard(Ward ward);
    void addRoomForWard(Ward ward);
    void editWard(Ward ward);
    void editRoomNumber(Ward ward);
    void removeWard(Ward ward);
    void removeRoomNumber(Ward ward);
    ArrayList<Ward> getAllWards();
}
