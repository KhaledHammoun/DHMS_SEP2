package server.networking.manager;

import server.model.manager.WardServerModelManager;
import server.model.manager.WardServerModelManagerImpl;
import shared.Ward;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class WardServerManagerRMI implements WardServerManager
{
    private WardServerModelManager modelManager;

    public WardServerManagerRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        modelManager = new WardServerModelManagerImpl();
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("WardServerManager", this);
        System.out.println("WardServerManager is running");
    }

    @Override
    public void addWard(Ward ward)
    {
        modelManager.addWard(ward);
    }

    @Override
    public void addRoomForWard(Ward ward)
    {
        modelManager.addRoomForWard(ward);
    }

    @Override
    public void editWard(Ward ward)
    {
        modelManager.editWard(ward);
    }

    @Override
    public void editRoomNumber(Ward ward)
    {
        modelManager.editRoomNumber(ward);
    }

    @Override
    public void removeWard(Ward ward)
    {
        modelManager.removeWard(ward);
    }

    @Override
    public void removeRoomNumber(Ward ward)
    {
        modelManager.removeRoomNumber(ward);
    }

    @Override
    public ArrayList<Ward> getAllWards()
    {
        return modelManager.getAllWards();
    }
}
