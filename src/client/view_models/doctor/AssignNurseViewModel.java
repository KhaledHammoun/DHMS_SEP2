package client.view_models.doctor;

import client.model.doctor.NursesModelDoctor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.CurrentUser;
import shared.Doctor;
import shared.Nurse;

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

  public void assignNurse(Nurse selectedNurse)
  {
    Doctor currentDoctorUser = (Doctor) CurrentUser.getInstance()
        .getCurrentUser();

    nursesModelDoctor.assignNurse(selectedNurse, currentDoctorUser);
    loadTables();
  }

  public void loadTables()
  {
    availableNurses.setAll(nursesModelDoctor.getAllAvailableNurses());
    assignedNurses.setAll(nursesModelDoctor.getAllNursesAssignedToMe(
        (Doctor) CurrentUser.getInstance().getCurrentUser()));
  }
}
