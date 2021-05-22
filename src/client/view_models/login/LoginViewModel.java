package client.view_models.login;

import client.model.login.Login;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import shared.AccessType;
import shared.LoginUser;
import shared.Validator;

public class LoginViewModel
{
    private Login loginModel;
    private StringProperty username;
    private StringProperty password;
    private StringProperty errorLabel;
    private BooleanProperty managerProperty;
    private BooleanProperty doctorProperty;
    private BooleanProperty nurseProperty;


    public LoginViewModel(Object loginModel)
    {
        this.loginModel = (Login) loginModel;
        this.username = new SimpleStringProperty();
        this.password = new SimpleStringProperty();
        this.errorLabel = new SimpleStringProperty();
        managerProperty = new SimpleBooleanProperty();
        doctorProperty = new SimpleBooleanProperty();
        nurseProperty = new SimpleBooleanProperty();
    }

    public void login()
    {
//        LoginUser loginUser = null;
//        if (!Validator.isValidPassword(password.getValue()))
//        {
//            errorLabel.setValue("Invalid password");
//            username.setValue(" ");
//            password.setValue(" ");
//            return;
//        }
//
//        if (managerProperty.getValue())
//        {
//            loginUser = new LoginUser(username.getValue(), password.getValue(), AccessType.MANAGER);
//
//        }
//        else if (doctorProperty.getValue())
//        {
//            loginUser = new LoginUser(username.getValue(), password.getValue(), AccessType.DOCTOR);
//
//        }
//        else if (nurseProperty.getValue())
//        {
//            loginUser = new LoginUser(username.getValue(), password.getValue(), AccessType.NURSE);
//
//        }
//
//        successLogin(loginModel.login(loginUser));
    }

    public void successLogin(AccessType type)
    {
        if (type.equals(AccessType.NO_ACCESS))
        {
            errorLabel.setValue("Wrong username or password.");
            setNoAccess();
            username.setValue("");
            password.setValue("");
        }
        else if (type.equals(AccessType.MANAGER))
        {
            //TODO
        }
        else if (type.equals(AccessType.DOCTOR))
        {
            //TODO
        }
        else if (type.equals(AccessType.NURSE))
        {
            //TODO
        }
    }

    private void setNoAccess()
    {
        managerProperty.setValue(false);
        doctorProperty.setValue(false);
        nurseProperty.setValue(false);
    }


    public StringProperty getUsernameProperty()
    {
        return username;
    }

    public StringProperty getPasswordProperty()
    {
        return password;
    }

    public StringProperty getErrorLabel()
    {
        return errorLabel;
    }

    public BooleanProperty getManagerProperty()
    {
        return managerProperty;
    }

    public BooleanProperty getDoctorProperty()
    {
        return doctorProperty;
    }

    public BooleanProperty getNurseProperty()
    {
        return nurseProperty;
    }
}
