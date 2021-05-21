package client.model.shared;

import client.networking.shared.GetAppointmentDataClient;
import shared.Appointment;
import shared.Doctor;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class GetAppointmentDataModelImpl implements GetAppointmentDataModel
{
    private GetAppointmentDataClient sharedClient;

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
    public ArrayList<Appointment> getAppointmentForDoctor(Doctor doctor)
    {
        try
        {
            return sharedClient.getAppointmentForDoctor(doctor);
        }
        catch (RemoteException e)
        {
            throw new RuntimeException("Error while fetching all appointments. Please try again.");
        }
    }
}
