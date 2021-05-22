package client.view_models.doctor;

import client.model.doctor.TreatAndUpdateModelDoctor;
import client.model.shared.GetPatientDataModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Diagnosis;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;

public class DoctorTreatViewModel
{
  private ObservableList<Diagnosis> diagnoses;
  private StringProperty medication;
  private StringProperty description;

  private GetPatientDataModel getPatientDataModel;
  private TreatAndUpdateModelDoctor treatAndUpdateModelDoctor;

  public DoctorTreatViewModel(TreatAndUpdateModelDoctor treatAndUpdateModelDoctor, GetPatientDataModel getPatientDataModel)
  {
    this.getPatientDataModel = getPatientDataModel;
    this.treatAndUpdateModelDoctor = treatAndUpdateModelDoctor;
    medication = new SimpleStringProperty();
    description = new SimpleStringProperty();
    //ToDo implement observer
    //treatAndUpdateModelDoctor.addListener("AllDiagnosis", this::loadDiagnoses);
    diagnoses = FXCollections.observableArrayList();

  }

  public void loadDiagnoses(PropertyChangeEvent evt)
  {
    diagnoses.addAll((ArrayList<Diagnosis>) evt.getNewValue());
  }
  public ObservableList<Diagnosis> getDiagnoses()
  {
    return diagnoses;
  }

  public StringProperty medicationProperty()
  {
    return medication;
  }

  public StringProperty descriptionProperty()
  {
    return description;
  }
}
