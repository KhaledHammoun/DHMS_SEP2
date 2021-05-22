package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import shared.Nurse;

public class AssignNurseViewController implements ViewController
{

    @FXML
    private TableColumn<Nurse, String> availableNurseFirstName;
    @FXML
    private TableColumn<Nurse, String> availableNurseLastName;
    @FXML
    private TableColumn<Nurse, Long> availableNurseSSN;
    @FXML
    private TableView<Nurse> assignedNurseTable;
    @FXML
    private TableColumn<Nurse, String> assignedNurseFirstName;
    @FXML
    private TableColumn<Nurse, String> assignedNurseLastName;
    @FXML
    private TableColumn<Nurse, Long> assignedNurseSSN;
    @FXML
    private TableView<Nurse> nursesTable;
    @FXML
    private Button assignButton;

    @FXML
    public void onAssignButton()
    {
        //ToDo
    }

    @FXML
    public void onBackButton()
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
