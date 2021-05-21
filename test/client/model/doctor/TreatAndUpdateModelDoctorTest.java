package client.model.doctor;

import client.networking.doctor.TreatAndUpdateClientDoctor;
import client.networking.doctor.TreatAndUpdateClientDoctorRMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.Diagnosis;
import shared.Doctor;
import shared.Patient;
import shared.Treatment;

import java.sql.Date;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TreatAndUpdateModelDoctorTest
{
  private TreatAndUpdateModelDoctor test;
  private Patient testPatient;

  @BeforeEach public void setup()
  {
    TreatAndUpdateClientDoctor client = new TreatAndUpdateClientDoctorRMI();
    test = new TreatAndUpdateModelDoctorImpl(client);

    testPatient = new Patient(null, null, null, 1856636939L, null, null, null,
        null, null, null, "A-", null, 'M');
  }

  //Tests are depended on passing on each other. Visually new diagnosis can be seen in database.
  @Test public void addDiagnosisToPatient()
  {
    Diagnosis diagnosis = new Diagnosis("", 2, "", new Date(38724), 0);
    test.addDiagnosisToPatient(testPatient, diagnosis);

    ArrayList<Diagnosis> allDiseaseOfPatient = test
        .getAllDiagnosisOfPatient(testPatient);

    boolean isPassed = false;
    for (Diagnosis d : allDiseaseOfPatient)
    {
      if (d.getName().equals(diagnosis.getName())
          && d.getSeverityLevel() == diagnosis.getSeverityLevel() && d
          .getDescription().equals(diagnosis.getDescription()))
      {
        isPassed = true;
        break;
      }
    }
    assertTrue(isPassed);
  }

  @Test public void getAllDiagnosisOfPatient()
  {
    ArrayList<Diagnosis> allDiseaseOfPatient = test
        .getAllDiagnosisOfPatient(testPatient);

    assertNotEquals(0, allDiseaseOfPatient.size());
  }

  //Data added into database when checking.
  @Test public void treatPatient()
  {
    Doctor doctor = new Doctor("", "", "", 9255072583L, null, null, null, null,
        null, null, null, null, null, null, null, null);

    Treatment treatment = new Treatment("Drops", "Halabala");

    Diagnosis diagnosis = test.getAllDiagnosisOfPatient(testPatient).get(0);
    test.treatPatient(testPatient, diagnosis, doctor, treatment);

  }

  @Test public void editDiagnosis()
  {
    Diagnosis diagnosis = test.getAllDiagnosisOfPatient(testPatient).get(0);
    diagnosis.setDescription("Halabala");
    test.editDiagnosis(diagnosis);

    ArrayList<Diagnosis> allDiagnosisOfPatient = test
        .getAllDiagnosisOfPatient(testPatient);

    boolean isPassed = false;
    for (Diagnosis d : allDiagnosisOfPatient)
    {
      if (d.getDescription().equals(diagnosis.getDescription()))
      {
        isPassed = true;
        break;
      }
    }

    assertTrue(isPassed);
  }
}