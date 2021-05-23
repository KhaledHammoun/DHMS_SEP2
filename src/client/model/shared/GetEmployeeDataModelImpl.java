package client.model.shared;

import client.networking.shared.GetEmployeeDataClient;
import shared.Doctor;
import shared.Nurse;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class GetEmployeeDataModelImpl implements GetEmployeeDataModel
{
    private GetEmployeeDataClient sharedClient;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public GetEmployeeDataModelImpl(Object client)
    {
        sharedClient = (GetEmployeeDataClient) client;
    }

    @Override
    public ArrayList<Doctor> getListOfAllDoctors()
    {
        try
        {
            return sharedClient.getListOfAllDoctors();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all doctors from the system. Please try again.");
        }
    }

    @Override
    public ArrayList<Nurse> getListOfAllNurses()
    {
        try
        {
            return sharedClient.getListOfAllNurses();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all nurses from the system. Please try again.");
        }
    }

    @Override
    public Doctor getDoctorBySSN(long ssn)
    {
        try
        {
            return sharedClient.getDoctorBySSN(ssn);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching doctor from the system. Please try again.");

        }
    }

    @Override
    public Nurse getNurseBySSN(long ssn)
    {
        try
        {
            return sharedClient.getNurseBySSN(ssn);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching nurse from the system. Please try again.");

        }
    }

    @Override
    public void addPropertyChangeListener(String name, PropertyChangeListener listener)
    {
        support.addPropertyChangeListener(name, listener);
    }

    @Override
    public void removePropertyChangeListener(String name, PropertyChangeListener listener)
    {
        support.removePropertyChangeListener(name, listener);
    }
}
