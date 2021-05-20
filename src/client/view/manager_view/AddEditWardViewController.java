package client.view.manager_view;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import shared.Doctor;

public class AddEditWardViewController implements ViewController
{
    @FXML
    public TextField wardNameTextField;
    @FXML
    public TextField wardRoomNumber;
    @FXML
    public ListView<Doctor> doctorsAssignedToWardListView;

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

    }
}
