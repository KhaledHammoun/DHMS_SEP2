package client.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginViewController
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
}
