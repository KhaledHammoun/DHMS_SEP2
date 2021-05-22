package client.model.nurse;

import client.model.shared.GetAppointmentDataModel;
import client.model.shared.GetAppointmentDataModelImpl;
import client.networking.nurse.AppointmentsClientNurse;
import client.networking.nurse.AppointmentsClientNurseRMI;
import client.networking.shared.GetAppointmentDataClient;
import client.networking.shared.GetAppointmentDataClientRMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.Appointment;

import java.sql.Timestamp;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppointmentsModelNurseTest
{
  private AppointmentsModelNurse test;
  private GetAppointmentDataModel resultCheck;
  private Appointment appointment;

  @BeforeEach public void setUp()
  {
    AppointmentsClientNurse client = new AppointmentsClientNurseRMI();
    test = new AppointmentsModelNurseImpl(client);

    GetAppointmentDataClient appClient = new GetAppointmentDataClientRMI();
    resultCheck = new GetAppointmentDataModelImpl(appClient);

    appointment = new Appointment(new Timestamp(123456789),
        new Timestamp(1234567890), 6839987913L, 3275799614L);
  }

  @Test public void createAppointment()
  {
    test.createAppointment(appointment);

    assertTrue(isFoundInDB());
  }

  @Test public void removeAppointment()
  {
    test.removeAppointment(appointment);

    assertFalse(isFoundInDB());
  }

  private boolean isFoundInDB()
  {
    ArrayList<Appointment> allAppointments = resultCheck.getAllAppointments();
    for (Appointment a : allAppointments)
    {
      if (a.getDoctorSSN() == appointment.getDoctorSSN()
          && a.getPatientSSN() == appointment.getPatientSSN() && a.getFrom()
          .equals(appointment.getFrom()) && a.getTo()
          .equals(appointment.getTo()))
      {
        return true;
      }
    }
    return false;
  }
}