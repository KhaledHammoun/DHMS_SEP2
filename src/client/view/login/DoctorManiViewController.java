package client.view.login;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DoctorManiViewController implements ViewController
{
    @FXML
    private Label loggedInAsLabel;

    @FXML
    public void onLogoutButton()
    {
    }

    @FXML
    public void onAppointmentButton()
    {
    }

    @FXML
    public void onAssignNurseButton()
    {
    }

    @FXML
    public void onPatientsButton()
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
