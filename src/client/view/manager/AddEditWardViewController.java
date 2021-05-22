package client.view.manager;

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
    private TextField wardNameTextField;
    @FXML
    private TextField wardRoomNumber;
    @FXML
    private ListView<Doctor> doctorsAssignedToWardListView;

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
