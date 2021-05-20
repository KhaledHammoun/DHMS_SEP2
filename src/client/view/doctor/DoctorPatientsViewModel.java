package client.view.doctor;

import client.model.doctor.PatientModelDoctor;
import client.model.doctor.TreatAndUpdateModelDoctor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Patient;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class DoctorPatientsViewModel
{
  private ObservableList<Patient> patients;

  private PatientModelDoctor patientModelDoctor;

  public DoctorPatientsViewModel(PatientModelDoctor patientModelDoctor)
  {
    this.patientModelDoctor = patientModelDoctor;
    //ToDo implement observer
    //patientModelDoctor.addListener("NewPatient", this::onNewPatient);
    patients = FXCollections.observableArrayList();

  }

  private void onNewPatient(PropertyChangeEvent evt)
  {
    patients.add((Patient) evt.getNewValue());
  }

  public void loadPatients()
  {
    List<Patient> patientList = patientModelDoctor.getAllPatients();
    patients.addAll(patientList);
  }

  public ObservableList<Patient> getPatients()
  {
    return patients;
  }
}
