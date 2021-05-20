package client.model.doctor;

import client.networking.doctor.AppointmentsClientDoctor;
import client.networking.doctor.AppointmentsClientDoctorRMI;
import org.junit.jupiter.api.Test;
import shared.Appointment;
import shared.Doctor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class AppointmentsModelDoctorTest
{

  @Test public void getAllAppointments()
  {
    AppointmentsClientDoctor doctorClient = new AppointmentsClientDoctorRMI();
    AppointmentsModelDoctor test = new AppointmentsModelDoctorImpl(
        doctorClient);

    Doctor doctor = new Doctor("", "", "", 4128742239L, null, null, "", "", "",
        "", null, "", "", null, "", "");
    ArrayList<Appointment> allAppointments = test.getAllAppointments(doctor);
    assertNotEquals(null, allAppointments);
  }

  @Test public void removeAppointment()
  {
    AppointmentsClientDoctor doctorClient = new AppointmentsClientDoctorRMI();
    AppointmentsModelDoctor test = new AppointmentsModelDoctorImpl(
        doctorClient);

    Doctor doctor = new Doctor("", "", "", 4128742239L, null, null, "", "", "",
        "", null, "", "", null, "", "");

    ArrayList<Appointment> allAppointments = test.getAllAppointments(doctor);

    int size = allAppointments.size();
    assertNotEquals(0, size);

    test.removeAppointment(allAppointments.get(0));
    allAppointments = test.getAllAppointments(doctor);
    System.out.println(allAppointments.get(0));

    assertEquals( size -1, allAppointments.size());

  }
}