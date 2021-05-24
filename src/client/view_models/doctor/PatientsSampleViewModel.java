package client.view_models.doctor;

import client.model.doctor.SampleModelDoctor;
import client.shared.SelectionModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Patient;
import shared.Sample;

public class PatientsSampleViewModel
{
  private ObservableList<Sample> samples;

  private SampleModelDoctor sampleModelDoctor;
  private Patient patient;

  public PatientsSampleViewModel(Object sampleModelDoctor)
  {
    this.sampleModelDoctor = (SampleModelDoctor) sampleModelDoctor;
    samples = FXCollections.observableArrayList();
  }

  public ObservableList<Sample> getSamples()
  {
    return samples;
  }

  public void loadSelectedPatientData()
  {
    patient = (Patient) SelectionModel.getInstance().get();
    samples.clear();
    if (patient == null)
    {
      samples.setAll(sampleModelDoctor.getAllSamples());
    }
    else
    {
      samples.setAll(sampleModelDoctor.getAllPatientSamples(patient));
    }
  }
}

