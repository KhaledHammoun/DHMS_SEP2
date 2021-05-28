package client.networking.shared;

import shared.callback.UpdateType;
import shared.util.PropertyChangeSubject;

import java.beans.PropertyChangeEvent;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CallBack extends Remote
{
  void update(PropertyChangeEvent evt) throws RemoteException;
}
