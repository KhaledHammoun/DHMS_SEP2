package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MangerSideBarControllerController implements ViewController
{
    @FXML
    private Label loggedAsLabel;

    @FXML
    public void employeeMenuButton()
    {
        System.out.println("Employee button pressed. SideBar controller");
    }

    @FXML
    public void logoutButton()
    {
        System.out.println("Logout button pressed. SideBar controller");
    }

    @FXML
    public void wardMenuButton()
    {
        System.out.println("Ward button pressed. SideBar controller");
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
