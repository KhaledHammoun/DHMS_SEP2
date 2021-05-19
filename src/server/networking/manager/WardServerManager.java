package server.networking.manager;

import shared.Ward;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface WardServerManager extends Remote
{
    void addWard(Ward ward) throws RemoteException;
    void addRoomForWard(Ward ward) throws RemoteException;
    void editWard(Ward ward) throws RemoteException;
    void editRoomNumber(Ward ward) throws RemoteException;
    void removeWard(Ward ward) throws RemoteException;
    void removeRoomNumber(Ward ward) throws RemoteException;
    ArrayList<Ward> getAllWards() throws RemoteException;
}
