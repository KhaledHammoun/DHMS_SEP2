package client.model.doctor;

import client.networking.doctor.NurseClientDoctor;
import client.networking.doctor.NurseClientDoctorRMI;
import org.junit.jupiter.api.Test;
import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NursesModelDoctorTest
{
  @Test public void getAllAvailableNurses()
  {
    NurseClientDoctor client = new NurseClientDoctorRMI();
    NursesModelDoctor test = new NursesModelDoctorImpl(client);

    ArrayList<Nurse> allAvailableNurses = test.getAllAvailableNurses();
    assertNotEquals(null, allAvailableNurses);
  }

  @Test public void assignNurse()
  {
    NurseClientDoctor client = new NurseClientDoctorRMI();
    NursesModelDoctor test = new NursesModelDoctorImpl(client);

    ArrayList<Nurse> allAvailableNurses = test.getAllAvailableNurses();
    int before = allAvailableNurses.size();
    assertNotEquals(0, before);

    Doctor doctorToAssign = new Doctor("", "", "", 9255072583L, null, null,
        null, null, null, null, null, null, null, null, null, null);
    test.assignNurse(allAvailableNurses.get(0), doctorToAssign);

    allAvailableNurses = test.getAllAvailableNurses();
    assertEquals(before - 1, allAvailableNurses.size());
  }

  @Test public void getAllNursesAssignedToMe()
  {
    NurseClientDoctor client = new NurseClientDoctorRMI();
    NursesModelDoctor test = new NursesModelDoctorImpl(client);

    Doctor doctorToAssign = new Doctor("", "", "", 9255072583L, null, null,
        null, null, null, null, null, null, null, null, null, null);
    ArrayList<Nurse> allNursesAssignedToMe = test
        .getAllNursesAssignedToMe(doctorToAssign);

    assertNotEquals(null, allNursesAssignedToMe);
  }
}