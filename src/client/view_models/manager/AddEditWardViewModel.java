package client.view_models.manager;

import client.model.manager.WardModelManager;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Doctor;

public class AddEditWardViewModel
{
  private ObservableList<Doctor> doctorsInWard;
  private StringProperty wardNameProperty;
  private StringProperty roomNumberProperty;

  private WardModelManager wardModelManager;

  public AddEditWardViewModel(WardModelManager wardModelManager)
  {
    this.wardModelManager = wardModelManager;
    doctorsInWard = FXCollections.observableArrayList();
    wardNameProperty = new SimpleStringProperty();
    roomNumberProperty = new SimpleStringProperty();
  }

  public ObservableList<Doctor> getDoctorsInWard()
  {
    return doctorsInWard;
  }

  public StringProperty wardNameProperty()
  {
    return wardNameProperty;
  }

  public StringProperty roomNumberProperty()
  {
    return roomNumberProperty;
  }
}
