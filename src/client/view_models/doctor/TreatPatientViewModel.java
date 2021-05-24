package client.view_models.doctor;

import client.model.doctor.TreatAndUpdateModelDoctor;
import client.model.shared.GetPatientDataModel;
import client.shared.SelectionModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.*;

import java.security.InvalidParameterException;

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

  public void addTreatment(String medication, Diagnosis selectedDiagnosis) throws InvalidParameterException
  {
    if (validateInput(medication, selectedDiagnosis))
    {
      throw new InvalidParameterException("Please fill in all the data.");
    }
    Treatment treatment = new Treatment(medication, description.get());
    treatAndUpdateModelDoctor.treatPatient(patient, selectedDiagnosis,
        (Doctor) CurrentUser.getInstance().getCurrentUser(), treatment);
  }

  private boolean validateInput(String medication, Diagnosis selectedDiagnosis)
  {
    return medication == null || selectedDiagnosis == null || description.get() == null || patient == null;
  }
}
