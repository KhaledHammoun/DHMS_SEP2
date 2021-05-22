package client.view_models.doctor;

import client.model.doctor.SampleModelDoctor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Sample;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;

public class DoctorAddEditSampleViewModel
{
  private ObservableList<Sample> samples;

  private SampleModelDoctor sampleModelDoctor;

  public DoctorAddEditSampleViewModel(SampleModelDoctor sampleModelDoctor)
  {
    this.sampleModelDoctor = sampleModelDoctor;
    //ToDo implement observer
    //sampleModelDoctor.addListener("AllSamples", this::loadSamples);
    samples = FXCollections.observableArrayList();
  }
  public void loadSamples(PropertyChangeEvent evt)
  {
    samples.addAll((ArrayList<Sample>) evt.getNewValue());
  }
  public ObservableList<Sample> getSamples()
  {
    return samples;
  }
}
