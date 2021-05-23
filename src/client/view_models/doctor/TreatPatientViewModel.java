package client.view_models.doctor;

import client.model.doctor.TreatAndUpdateModelDoctor;
import client.model.shared.GetPatientDataModel;
import client.shared.SelectionModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SingleSelectionModel;
import shared.*;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;

public class TreatPatientViewModel
{
  private ObservableList<Diagnosis> diagnoses;
  private ObservableList<Treatment> treatments;
  private StringProperty description;
  private Patient patient;

  private GetPatientDataModel getPatientDataModel;
  private TreatAndUpdateModelDoctor treatAndUpdateModelDoctor;

  public TreatPatientViewModel(Object treatAndUpdateModelDoctor,
      Object getPatientDataModel)
  {
    this.getPatientDataModel = (GetPatientDataModel) getPatientDataModel;
    this.treatAndUpdateModelDoctor = (TreatAndUpdateModelDoctor) treatAndUpdateModelDoctor;
    description = new SimpleStringProperty();

    diagnoses = FXCollections.observableArrayList();
    treatments = FXCollections.observableArrayList();
  }

  public void loadDiagnoses()
  {
    diagnoses.setAll(treatAndUpdateModelDoctor.getAllDiagnosisOfPatient(patient));
  }

  public ObservableList<Diagnosis> getDiagnoses()
  {
    return diagnoses;
  }

  public ObservableList<Treatment> getTreatments()
  {
    return treatments;
  }


  public StringProperty descriptionProperty()
  {
    return description;
  }

  //TODO
  public void loadTreatments()
  {
    treatments.setAll(treatAndUpdateModelDoctor
        .getAllTreatmentsOfPatient(patient,
            (Doctor) CurrentUser.getInstance().getCurrentUser()));
  }

  public void loadSelectedPatient()
  {
    patient = (Patient) SelectionModel.getInstance().get();
  }

  public void addTreatment(String medication, Diagnosis selectedDiagnosis)
  {
    Treatment treatment = new Treatment(medication, description.get());
    treatAndUpdateModelDoctor.treatPatient(patient, selectedDiagnosis,
        (Doctor) CurrentUser.getInstance().getCurrentUser(), treatment);
  }
}
