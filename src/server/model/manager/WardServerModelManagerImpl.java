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
    public void editWard(Ward oldWard, Ward newWard)
    {
        dbAccessManager.editWard(oldWard, newWard);
    }


    @Override
    public void removeWard(Ward ward)
    {
        dbAccessManager.removeWard(ward);
    }


    @Override
    public ArrayList<Ward> getAllWards()
    {
        return dbAccessManager.getAllWards();
    }
}
