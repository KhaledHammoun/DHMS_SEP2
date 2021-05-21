package client.model.manager;

import client.model.shared.GetEmployeeDataModel;
import client.model.shared.GetEmployeeDataModelImpl;
import client.networking.manager.EmployeeClientManager;
import client.networking.manager.EmployeeClientRMI;
import client.networking.shared.GetEmployeeDataClient;
import client.networking.shared.GetEmployeeDataClientRMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.Address;
import shared.Doctor;
import shared.Nurse;
import shared.Ward;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class EmployeeModelManagerTest
{
  private EmployeeModelManager test;
  private Doctor testDoctor;
  private GetEmployeeDataModel resultCheck;
  private Nurse testNurse;

  @BeforeEach public void setup()
  {
    EmployeeClientManager client = new EmployeeClientRMI();
    test = new EmployeeModelManagerImpl(client);

    testDoctor = new Doctor("Test", "", "", 1010101010L, null,
        new Address("", "", "", ""), "", "", "", "", new Date(1239781), "", "",
        new Ward("Examination", 100), "123@123.123", "123ABcd123");
    testNurse = new Nurse(1010101010L, 0, "Test", "", "", new Date(12312),
        new Address("", "", "", ""), "", "", "", "", new Date(1234), "", "",
        "123@123.com", "123Abcd123");

    GetEmployeeDataClient resultClient = new GetEmployeeDataClientRMI();
    resultCheck = new GetEmployeeDataModelImpl(resultClient);
  }

  @Test public void addDoctor()
  {
    test.addDoctor(testDoctor);

    Doctor result = resultCheck.getDoctorBySSN(testDoctor.getSsn());
    assertEquals(testDoctor.getSsn(), result.getSsn());
  }

  @Test public void addNurse()
  {
    test.addNurse(testNurse);

    Nurse result = resultCheck.getNurseBySSN(testNurse.getSsn());
    assertEquals(testNurse.getSsn(), result.getSsn());
  }

  @Test public void editDoctor()
  {
    testDoctor.setEducation("Via UC");
    test.editDoctor(testDoctor);

    Doctor resultDoctor = resultCheck.getDoctorBySSN(testDoctor.getSsn());
    assertEquals("Via UC", resultDoctor.getEducation());
  }

  @Test public void editNurse()
  {
    testNurse.setEducation("Via UC");
    test.editNurse(testNurse);

    Nurse resultNurse = resultCheck.getNurseBySSN(testNurse.getSsn());
    assertEquals("Via UC", resultNurse.getEducation());
  }

  @Test public void removeDoctor()
  {
    test.removeDoctor(testDoctor);

    Doctor result = resultCheck.getDoctorBySSN(testDoctor.getSsn());
    assertNull(result);
  }

  @Test public void removeNurse()
  {
    test.removeNurse(testNurse);

    Nurse result = resultCheck.getNurseBySSN(testNurse.getSsn());
    assertNull(result);
  }
}