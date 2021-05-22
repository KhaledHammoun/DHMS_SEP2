package client.model.shared;

import client.model.nurse.AppointmentsModelNurse;
import client.model.nurse.AppointmentsModelNurseImpl;
import client.networking.nurse.AppointmentsClientNurse;
import client.networking.nurse.AppointmentsClientNurseRMI;
import client.networking.shared.GetAppointmentDataClient;
import client.networking.shared.GetAppointmentDataClientRMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.Address;
import shared.Appointment;
import shared.Doctor;
import shared.Ward;

import java.sql.Date;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class GetAppointmentDataModelTest
{
  private GetAppointmentDataModel test;

  @BeforeEach public void setUp()
  {
    GetAppointmentDataClient dataClient = new GetAppointmentDataClientRMI();
    test = new GetAppointmentDataModelImpl(dataClient);
  }

  @Test public void getAllAppointments()
  {
    ArrayList<Appointment> allAppointments = test.getAllAppointments();

    assertNotNull(allAppointments);
  }

  @Test public void getAppointmentsForDoctor()
  {
    AppointmentsClientNurse client = new AppointmentsClientNurseRMI();
    AppointmentsModelNurse addAppointment = new AppointmentsModelNurseImpl(
        client);

    Doctor testDoctor = new Doctor("Test", "", "", 4980077419L, null,
        new Address("", "", "", ""), "", "", "", "", new Date(1239781), "", "",
        new Ward("Examination", 100), "123@123.123", "123ABcd123");

    ArrayList<Appointment> appointmentsForDoctor = test
        .getAppointmentsForDoctor(testDoctor);

    assertNotNull(appointmentsForDoctor);
  }
}