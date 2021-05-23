package client.model.shared;

import client.networking.shared.GetAppointmentDataClient;
import shared.Appointment;
import shared.Doctor;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class GetAppointmentDataModelImpl implements GetAppointmentDataModel
{
    private GetAppointmentDataClient sharedClient;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public GetAppointmentDataModelImpl(Object client)
    {
        sharedClient = (GetAppointmentDataClient) client;
    }

    @Override
    public ArrayList<Appointment> getAllAppointments()
    {
        try
        {
            return sharedClient.getAllAppointments();
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all appointments. Please try again.");
        }
    }

    @Override
    public ArrayList<Appointment> getAppointmentsForDoctor(Doctor doctor)
    {
        try
        {
            return sharedClient.getAppointmentsForDoctor(doctor);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all appointments. Please try again.");
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
