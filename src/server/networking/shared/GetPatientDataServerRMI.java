package server.networking.shared;

import server.model.shared.GetPatientDataServerModel;
import server.model.shared.GetPatientDataServerModelImpl;
import shared.Patient;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class GetPatientDataServerRMI implements GetPatientDataServer
{
    private GetPatientDataServerModel sharedServerModel;

    public GetPatientDataServerRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        sharedServerModel = new GetPatientDataServerModelImpl();
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("GetPatientDataServer", this);
        System.out.println("GetPatientDataServer is running.");
    }

    @Override
    public ArrayList<Patient> getAllPatients()
    {
        return null;
    }

    @Override
    public Patient getPatientBySSN(long ssn)
    {
        return null;
    }
}
