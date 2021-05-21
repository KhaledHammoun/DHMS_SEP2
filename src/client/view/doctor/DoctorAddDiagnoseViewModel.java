package client.view.doctor;

import client.model.doctor.TreatAndUpdateModelDoctor;
import javafx.beans.property.*;

import java.time.LocalDate;

public class DoctorAddDiagnoseViewModel
{
  private StringProperty name;
  private StringProperty description;
  private StringProperty severityLevel;
  private ObjectProperty<LocalDate> startDate;
  private ObjectProperty<LocalDate> endDate;

  private TreatAndUpdateModelDoctor treatAndUpdateModelDoctor;

  public DoctorAddDiagnoseViewModel(TreatAndUpdateModelDoctor treatAndUpdateModelDoctor)
  {
    this.treatAndUpdateModelDoctor = treatAndUpdateModelDoctor;
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
