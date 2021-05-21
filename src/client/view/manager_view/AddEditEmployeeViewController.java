package client.view.manager_view;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import shared.Ward;

public class AddEditEmployeeViewController implements ViewController
{
    @FXML
    public TextField employeeSSNTextField;
    @FXML
    public TextField employeeFirstNameTextField;
    @FXML
    public TextField employeeMidNameTextField;
    @FXML
    public TextField employeeLastNameTextField;
    @FXML
    public DatePicker employeeDOBDateField;
    @FXML
    public TextField employeeStreetTextField;
    @FXML
    public TextField employeeStreetNoTextField;
    @FXML
    public TextField employeeZipCodeTextField;
    @FXML
    public TextField employeeCityTextField;
    @FXML
    public TextField employeeEContactFNameTextField;
    @FXML
    public TextField employeeEContactLNameTextField;
    @FXML
    public TextField employeeEContactPhoneTextField;


    @FXML
    public ComboBox<Ward> employeeWardComboBox;
    @FXML
    public TextField usernameTextField;
    @FXML
    public TextField passwordTextField;
    public TextArea employeeExperienceTextArea;
    public TextArea employeeEducationTextArea;

    @FXML
    public void onSaveButtonEmployee()
    {
    }

    @FXML
    public void onClearButtonEmployee()
    {
    }

    @FXML
    public void onBackButtonEmployee()
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
