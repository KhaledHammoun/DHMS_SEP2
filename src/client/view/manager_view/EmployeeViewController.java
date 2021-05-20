package client.view.manager_view;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import shared.Employee;

public class EmployeeViewController implements ViewController
{
    @FXML
    public ComboBox<String> employeeTypeComboBox;
    @FXML
    public TableView<Employee> employeeTable;
    @FXML
    public TableColumn<Long, Employee> ssnColumn;
    @FXML
    public TableColumn<String, Employee> fNameColumn;
    @FXML
    public TableColumn<String, Employee> lNameColumn;

    @FXML
    public void onGetButton()
    {
    }

    @FXML
    public void onAddEmployeeButton()
    {
    }

    @FXML
    public void onEditEmployeeButton()
    {
    }

    @FXML
    public void onRemoveEmployeeButton()
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
