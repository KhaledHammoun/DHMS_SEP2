package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import client.view_models.manager.AddEditWardViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Doctor;

public class AddEditWardViewController implements ViewController
{
    @FXML
    private TableView<Doctor> doctorsAssignedToWardTable;
    @FXML
    private TableColumn<String, Doctor> doctorsAssignedToWardFirstName;
    @FXML
    private TableColumn<String, Doctor> doctorsAssignedToWardLastName;
    @FXML
    private TableColumn<Long, Doctor> doctorsAssignedToWardLSSN;
    @FXML
    private TextField wardNameTextField;
    @FXML
    private TextField wardRoomNumber;
    @FXML
    private ListView<Doctor> doctorsAssignedToWardListView;

    private ViewHandler viewHandler;
    private AddEditWardViewModel viewModel;

    @FXML
    public void onSaveButton()
    {
    }

    @FXML
    public void onClearButton()
    {
    }

    @FXML
    public void onBackButton()
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {
        this.viewHandler = viewHandler;
        //TODO viewModel = viewModelFactory...
        doctorsAssignedToWardTable.setItems(viewModel.getDoctorsInWard());
        doctorsAssignedToWardFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        doctorsAssignedToWardLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        doctorsAssignedToWardLSSN.setCellValueFactory(new PropertyValueFactory<>("ssn"));
        wardNameTextField.textProperty().bindBidirectional(viewModel.wardNameProperty());
        wardRoomNumber.textProperty().bindBidirectional(viewModel.roomNumberProperty());

    }
}
