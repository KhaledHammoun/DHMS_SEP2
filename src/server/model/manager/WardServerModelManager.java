package server.model.manager;

import shared.Ward;

import java.util.ArrayList;

public interface WardServerModelManager
{
    void addWard(Ward ward);
    void addRoomForWard(Ward ward);
    String editWard(Ward ward);
    void editRoomNumber(Ward ward);
    void removeWard(Ward ward);
    void removeRoomNumber(Ward ward);
    ArrayList<Ward> getAllWards();
}
