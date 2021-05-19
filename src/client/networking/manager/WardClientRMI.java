package client.networking.manager;

import server.networking.manager.WardServerManager;
import shared.Ward;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class WardClientRMI implements WardClientManager
{
  private WardServerManager serverManager;

  public WardClientRMI()
  {
    try
    {
      Registry registry = LocateRegistry.getRegistry(1099);
      serverManager = (WardServerManager) registry.lookup("WardServerManager");
    }
    catch (RemoteException | NotBoundException e)
    {
      throw new RuntimeException("Could not connect to the server, please try again later.");
    }
  }

  @Override public void addWard(Ward ward)
  {
    try
    {
      serverManager.addWard(ward);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while adding ward. Please try again.");

    }
  }

  @Override public void addRoomForAWard(Ward ward)
  {
    try
    {
      serverManager.addRoomForWard(ward);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while adding ward room. Please try again.");
    }
  }

  @Override public String editWard(Ward ward)
  {
    try
    {
      return serverManager.editWard(ward);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while editing ward. Please try again.");
    }
  }

  @Override public void editRoomNumber(Ward ward)
  {
    try
    {
      serverManager.editRoomNumber(ward);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while editing ward room number. Please try again.");
    }
  }

  @Override public void removeWard(Ward ward)
  {
    try
    {
      serverManager.removeWard(ward);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while removing ward. Please try again.");
    }
  }

  @Override public void removeRoom(Ward ward)
  {
    try
    {
      serverManager.removeRoomNumber(ward);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while removing ward room. Please try again.");
    }
  }

  @Override public ArrayList<Ward> getAllWards()
  {
    try
    {
      return serverManager.getAllWards();
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching all wards. Please try again.");
    }
  }
}
