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
