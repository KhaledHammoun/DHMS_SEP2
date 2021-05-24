package client.view_models.doctor;

import client.model.doctor.NursesModelDoctor;
import client.shared.SelectionModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.CurrentUser;
import shared.Doctor;
import shared.Nurse;

import java.security.InvalidParameterException;

public class AssignNurseViewModel
{
  private ObservableList<Nurse> availableNurses;
  private ObservableList<Nurse> assignedNurses;

  private NursesModelDoctor nursesModelDoctor;

  public AssignNurseViewModel(Object nursesModelDoctor)
  {
    this.nursesModelDoctor = (NursesModelDoctor) nursesModelDoctor;
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

  public void assignNurse() throws InvalidParameterException
  {
    Nurse nurse = (Nurse) SelectionModel.getInstance().get();
    if (nurse == null)
    {
      throw new InvalidParameterException("Please select nurse to assign.");
    }
    Doctor currentDoctorUser = (Doctor) CurrentUser.getInstance()
        .getCurrentUser();

    nursesModelDoctor.assignNurse(nurse, currentDoctorUser);
    loadTables();
  }

  public void loadTables()
  {
    availableNurses.clear();
    assignedNurses.clear();
    availableNurses.setAll(nursesModelDoctor.getAllAvailableNurses());
    assignedNurses.setAll(nursesModelDoctor.getAllNursesAssignedToMe(
        (Doctor) CurrentUser.getInstance().getCurrentUser()));
  }
}
