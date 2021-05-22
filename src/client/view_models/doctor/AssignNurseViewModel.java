package client.view_models.doctor;

import client.model.doctor.NursesModelDoctor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Nurse;

public class AssignNurseViewModel
{
  private ObservableList<Nurse> availableNurses;
  private ObservableList<Nurse> assignedNurses;

  private NursesModelDoctor nursesModelDoctor;

  public AssignNurseViewModel(Object nursesModelDoctor)
  {
    this.nursesModelDoctor= (NursesModelDoctor) nursesModelDoctor;
    //ToDo implement observer
    availableNurses = FXCollections.observableArrayList();
    assignedNurses = FXCollections.observableArrayList();

  }

  public ObservableList<Nurse> getAvailableNurses()
  {
    return availableNurses;
  }

  public ObservableList<Nurse> getAssignedNurses()
  {
    return assignedNurses;
  }

}
