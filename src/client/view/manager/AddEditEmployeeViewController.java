package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import shared.Ward;

public class AddEditEmployeeViewController implements ViewController
{

    @FXML private TextField employeeSSNTextField;
    @FXML private TextField employeeFirstNameTextField;
    @FXML private TextField employeeMidNameTextField;
    @FXML private TextField employeeLastNameTextField;
    @FXML private DatePicker employeeDOBDateField;
    @FXML private TextField employeeStreetTextField;
    @FXML private TextField employeeStreetNoTextField;
    @FXML private TextField employeeZipCodeTextField;
    @FXML private TextField employeeCityTextField;
    @FXML private TextField employeeEContactFNameTextField;
    @FXML private TextField employeeEContactLNameTextField;
    @FXML private TextField employeeEContactPhoneTextField;


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
