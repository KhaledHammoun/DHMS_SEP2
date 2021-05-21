package client.view.login;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginViewController implements ViewController
{
    @FXML
    private TextField usernameTextFieldLogin;
    @FXML
    private PasswordField passwordFieldLogin;
    @FXML
    private RadioButton managerRadioLogin;
    @FXML
    private ToggleGroup AccessType;
    @FXML
    private RadioButton doctorRadioLogin;
    @FXML
    private RadioButton nurseRadioLogin;
    @FXML
    private Label errorLabelLogin;
    @FXML
    private Button loginButton;

    private ViewHandler viewHandler;
    private LoginViewModel loginViewModel;

    @FXML
    public void onLoginButton()
    {
        loginViewModel.login();
        if (!managerRadioLogin.isSelected() && !doctorRadioLogin.isSelected() && !nurseRadioLogin.isSelected())
        {
            return;
        }
        viewHandler.openView(View.MAIN);
        viewHandler.viewToPane(View.EMPLOYEE);
        viewHandler.setSidebar(View.SIDEBAR);
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {
        this.viewHandler = viewHandler;
        this.loginViewModel = (LoginViewModel) viewModelFactory.getViewModel(View.LOGIN);
        usernameTextFieldLogin.textProperty().bindBidirectional(loginViewModel.getUsernameProperty());
        passwordFieldLogin.textProperty().bindBidirectional(loginViewModel.getPasswordProperty());
        managerRadioLogin.selectedProperty().bindBidirectional(loginViewModel.getManagerProperty());
        doctorRadioLogin.selectedProperty().bindBidirectional(loginViewModel.getDoctorProperty());
        nurseRadioLogin.selectedProperty().bindBidirectional(loginViewModel.getNurseProperty());
        errorLabelLogin.textProperty().bindBidirectional(loginViewModel.getErrorLabel());
    }
}
