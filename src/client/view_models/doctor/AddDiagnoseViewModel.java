package client.view_models.doctor;

import client.model.doctor.TreatAndUpdateModelDoctor;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Diagnosis;
import shared.Patient;

import java.sql.Date;
import java.time.LocalDate;

public class AddDiagnoseViewModel
{
  private StringProperty name;
  private StringProperty description;
  private StringProperty severityLevel;
  private ObservableList<String> severityLevels;
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
    severityLevels = FXCollections.observableArrayList("1", "2", "3", "4","5");
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

  public ObservableList<String> getSeverityLevels()
  {
    return severityLevels;
  }


  public void addNewDiagnosisToPatient()
  {
    //TODO  Diagnosis diagnosis = new Diagnosis(name.getValue(), severityLevel.getValue(),description.getValue(),new Date(startDate.getValue()),null);

  }

}
