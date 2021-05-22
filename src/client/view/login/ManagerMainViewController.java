package client.view.login;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ManagerMainViewController implements ViewController
{
    @FXML
    private Label loggedInAsLabel;

    @FXML
    public void onEmployeeButton(ActionEvent actionEvent)
    {
    }

    @FXML
    public void onWardsButton(ActionEvent actionEvent)
    {
    }

    @FXML
    public void onLogoutButton(ActionEvent actionEvent)
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
