package client.view_models.doctor;

import client.model.doctor.TreatAndUpdateModelDoctor;
import javafx.beans.property.*;

import java.time.LocalDate;

public class AddDiagnoseViewModel
{
  private StringProperty name;
  private StringProperty description;
  private StringProperty severityLevel;
  private ObjectProperty<LocalDate> startDate;
  private ObjectProperty<LocalDate> endDate;

  private TreatAndUpdateModelDoctor treatAndUpdateModelDoctor;

  public AddDiagnoseViewModel(Object treatAndUpdateModelDoctor)
  {
    this.treatAndUpdateModelDoctor = (TreatAndUpdateModelDoctor) treatAndUpdateModelDoctor;
    name = new SimpleStringProperty();
    description = new SimpleStringProperty();
    severityLevel = new SimpleStringProperty();
    startDate = new SimpleObjectProperty<>();
    endDate =  new SimpleObjectProperty<>();
  }

  public StringProperty nameProperty()
  {
    return name;
  }

  public StringProperty descriptionProperty()
  {
    return description;
  }

  public StringProperty severityLevelProperty()
  {
    return severityLevel;
  }

  public ObjectProperty<LocalDate> startDateProperty()
  {
    return startDate;
  }

  public ObjectProperty<LocalDate> endDateProperty()
  {
    return endDate;
  }
}
