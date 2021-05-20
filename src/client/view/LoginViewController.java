package client.view;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginViewController implements ViewController
{
    @FXML
    public TextField usernameTextFieldLogin;
    @FXML
    public PasswordField passwordFieldLogin;
    @FXML
    public RadioButton managerRadioLogin;
    @FXML
    public ToggleGroup AccessType;
    @FXML
    public RadioButton doctorRadioLogin;
    @FXML
    public RadioButton nurseRadioLogin;
    @FXML
    public Label errorLabelLogin;
    @FXML
    public Button loginButton;

    @FXML
    public void onLoginButton(ActionEvent actionEvent)
    {
        System.out.println("Login pressed. Login controller");
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
