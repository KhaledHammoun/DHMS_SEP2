package client.view_models.doctor;

import client.model.doctor.SampleModelDoctor;
import client.shared.SelectionModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Patient;
import shared.Sample;

import java.security.InvalidParameterException;

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

  public void setPatientToAdd()
  {
    SelectionModel.getInstance().set(patient);
  }

  public void editSample() throws InvalidParameterException
  {
    if (SelectionModel.getInstance().isEmpty())
    {
      throw new InvalidParameterException("Please select sample.");
    }
  }
}

