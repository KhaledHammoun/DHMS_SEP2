package client.view_models.doctor;

import client.model.doctor.SampleModelDoctor;
import client.model.shared.GetPatientDataModel;
import client.shared.SelectionModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import shared.Sample;

import java.sql.Date;
import java.time.LocalDate;

public class AddEditSampleViewModel
{
  private StringProperty type;
  private ObjectProperty<LocalDate> deadline;
  private StringProperty priority;
  private StringProperty result;

  private Sample sample;
  private SampleModelDoctor sampleModelDoctor;
  private GetPatientDataModel getPatientDataModel;

  public AddEditSampleViewModel(Object sampleModelDoctor,
      Object getPatientDataModel)
  {
    this.getPatientDataModel = (GetPatientDataModel) getPatientDataModel;
    this.sampleModelDoctor = (SampleModelDoctor) sampleModelDoctor;
    type = new SimpleStringProperty();
    deadline = new SimpleObjectProperty<>();
    priority = new SimpleStringProperty();
    result = new SimpleStringProperty();
  }

  public StringProperty typeProperty()
  {
    return type;
  }

  public ObjectProperty<LocalDate> deadlineProperty()
  {
    return deadline;
  }

  public StringProperty priorityProperty()
  {
    return priority;
  }

  public StringProperty resultProperty()
  {
    return result;
  }

  public void loadSelectedSample()
  {
    if(SelectionModel.getInstance().isEmpty()){
      sample = (Sample) SelectionModel.getInstance().get();
      type.set(sample.getType());
      deadline.set(sample.getDeadline().toLocalDate());
      priority.set(String.valueOf(sample.getPriority()));
      result.setValue(sample.getResult());
    }
  }

  public void saveChanges()
  {
    Sample editedSample = new Sample(type.get(), result.get(),
        Integer.parseInt((priority.get())), Date.valueOf(deadline.get()),
        sample.getPatient_ssn(), sample.getSample_id());
    sampleModelDoctor.editSample(editedSample);
  }

  public void savePatient()
  {
    SelectionModel.getInstance()
        .set(getPatientDataModel.getPatientBySSN(sample.getPatient_ssn()));
  }
}
