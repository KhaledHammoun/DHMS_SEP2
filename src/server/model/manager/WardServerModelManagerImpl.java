package server.model.manager;

import server.database.manager.WardDBAccessImpl;
import server.database.manager.WardDBAccessManager;
import shared.Ward;

import java.util.ArrayList;

public class WardServerModelManagerImpl implements WardServerModelManager
{
    private WardDBAccessManager dbAccessManager;

    public WardServerModelManagerImpl()
    {
        dbAccessManager = new WardDBAccessImpl();
    }

    @Override
    public void addWard(Ward ward)
    {
        dbAccessManager.addWard(ward);
    }

    @Override
    public void addRoomForWard(Ward ward)
    {
        dbAccessManager.addRoomForWard(ward);
    }

    @Override
    public void editWard(Ward ward)
    {
        dbAccessManager.editWard(ward);
    }

    @Override
    public void editRoomNumber(Ward ward)
    {
        dbAccessManager.editRoomNumber(ward);
    }

    @Override
    public void removeWard(Ward ward)
    {
        dbAccessManager.removeWard(ward);
    }

    @Override
    public void removeRoomNumber(Ward ward)
    {
        dbAccessManager.removeRoomNumber(ward);
    }

    @Override
    public ArrayList<Ward> getAllWards()
    {
        return dbAccessManager.getAllWards();
    }
}
