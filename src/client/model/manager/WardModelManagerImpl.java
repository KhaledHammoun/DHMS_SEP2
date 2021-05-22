package client.model.manager;

import client.networking.manager.WardClientManager;
import shared.Ward;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class WardModelManagerImpl implements WardModelManager
{
  private WardClientManager clientManager;

  public WardModelManagerImpl(Object client)
  {
    clientManager = (WardClientManager) client;
  }

  @Override
  public void addWard(Ward ward)
  {
    try
    {
      clientManager.addWard(ward);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while adding ward. Please try again.");
    }
  }

  @Override public void editWard(Ward oldWard, Ward newWard)
  {
    try
    {
      clientManager.editWard(oldWard, newWard);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while editing ward. Please try again.");
    }
  }

  @Override public void removeWard(Ward ward)
  {
    try
    {
      clientManager.removeWard(ward);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while removing ward. Please try again.");
    }
  }

  @Override public ArrayList<Ward> getAllWards()
  {
    try
    {
      return clientManager.getAllWards();
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while fetching all wards. Please try again.");
    }
  }
}
