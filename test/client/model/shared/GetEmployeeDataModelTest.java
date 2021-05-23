package client.model.shared;

import client.networking.shared.GetEmployeeDataClient;
import client.networking.shared.GetEmployeeDataClientRMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.Doctor;
import shared.Nurse;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GetEmployeeDataModelTest
{
  private GetEmployeeDataModel test;

  @BeforeEach public void setUp()
  {
    GetEmployeeDataClient client = new GetEmployeeDataClientRMI();
    test = new GetEmployeeDataModelImpl(client);
  }

  @Test public void getListOfAllDoctors()
  {
    ArrayList<Doctor> listOfAllDoctors = test.getListOfAllDoctors();;
    assertNotNull(listOfAllDoctors);
  }

  @Test public void getListOfAllNurses()
  {
    ArrayList<Nurse> listOfAllNurses = test.getListOfAllNurses();
    assertNotNull(listOfAllNurses);
  }

  @Test public void getDoctorBySSN()
  {
    Doctor doctorBySSN = test.getDoctorBySSN(4980077419L);

    assertEquals(4980077419L, doctorBySSN.getSsn());
  }

  @Test public void getNurseBySSN()
  {
    Nurse nurseBySSN = test.getNurseBySSN(2533080787L);

    assertEquals(2533080787L, nurseBySSN.getSsn());
  }
}