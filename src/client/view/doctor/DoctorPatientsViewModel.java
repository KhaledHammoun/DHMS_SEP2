package client.view.doctor;

import client.model.doctor.SampleModelDoctor;

import client.model.shared.GetPatientDataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Patient;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class DoctorPatientsViewModel
{
  private ObservableList<Patient> patients;

  private GetPatientDataModel getPatientDataModel;
  private TreatAndUpdateModelDoctor treatAndUpdateModelDoctor;
  private SampleModelDoctor sampleModelDoctor;


  public DoctorPatientsViewModel(GetPatientDataModel getPatientDataModel,TreatAndUpdateModelDoctor treatAndUpdateModelDoctor,
      SampleModelDoctor sampleModelDoctor)
  {
    this.getPatientDataModel = getPatientDataModel;
    this.treatAndUpdateModelDoctor = treatAndUpdateModelDoctor;
    this.sampleModelDoctor = sampleModelDoctor;

    //ToDo implement observer
    //getPatientDataModel.addListener("NewPatient", this::onNewPatient);
    patients = FXCollections.observableArrayList();

  }

  private void onNewPatient(PropertyChangeEvent evt)
  {
    patients.add((Patient) evt.getNewValue());
  }

  public void loadPatients()
  {
    List<Patient> patientList = getPatientDataModel.getAllPatients();
    patients.addAll(patientList);
  }

  public ObservableList<Patient> getPatients()
  {
    return patients;
  }

  public void editMedicalDescription(long ssn)
  {
    getPatientDataModel.getPatientBySSN(ssn);
  }

  public void getAllDiseasesOfPatient(Patient patient)
  {
    treatAndUpdateModelDoctor.getAllDiagnosisOfPatient(patient);
  }

  public void getAllSamples(Patient patient)
  {
    sampleModelDoctor.getAllSamples();
  }
}
