package client.view.manager_view;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import shared.Ward;

public class AddEditEmployeeViewController implements ViewController
{
    @FXML
    public TextField ssnTextField;
    @FXML
    public TextField employeeFirstNameTextField;
    @FXML
    public TextField employeeMidNameTextField;
    @FXML
    public TextField employeeLastNameTextField;
    @FXML
    public DatePicker employeeFDOBDateField;
    @FXML
    public TextField employeeStreetTextField;
    @FXML
    public TextField employeeStreetNoTextField;
    @FXML
    public TextField employeeZipCodeTextField;
    @FXML
    public TextField employeeCityTextField;
    @FXML
    public TextField contactFirstNameTextField;
    @FXML
    public TextField contactLastNameTextField;
    @FXML
    public TextField contactPhoneTextField;
    @FXML
    public TextField employeeEducationTextField;
    @FXML
    public TextField employeeSecExpTextField;
    @FXML
    public ComboBox<Ward> employeeWardComboBox;
    @FXML
    public TextField usernameTextField;
    @FXML
    public TextField passwordTextField;

    @FXML
    public void onSaveButton()
    {
    }

    @FXML
    public void onClearButton()
    {
    }

    @FXML
    public void onBackButton()
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
