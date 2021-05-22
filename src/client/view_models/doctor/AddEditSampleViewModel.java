package client.view_models.doctor;

import client.model.doctor.SampleModelDoctor;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class AddEditSampleViewModel
{
  private StringProperty type;
  private ObjectProperty<LocalDate> deadline;
  private StringProperty priority;
  private StringProperty result;

  private SampleModelDoctor sampleModelDoctor;

  public AddEditSampleViewModel(Object sampleModelDoctor)
  {
    this.sampleModelDoctor = (SampleModelDoctor) sampleModelDoctor;
    type = new SimpleStringProperty();
    deadline =  new SimpleObjectProperty<>();
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
}
