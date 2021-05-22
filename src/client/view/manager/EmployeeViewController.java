package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.manager.EmployeeViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Employee;

public class EmployeeViewController implements ViewController
{
    @FXML
    private ComboBox<String> employeeTypeComboBox;
    @FXML
    private TableView<Employee> employeeTable;
    @FXML
    private TableColumn<Long, Employee> ssnColumn;
    @FXML
    private TableColumn<String, Employee> fNameColumn;
    @FXML
    private TableColumn<String, Employee> lNameColumn;
    private ViewHandler viewHandler;
    private EmployeeViewModel viewModel;

    @FXML
    public void onGetButton()
    {
        viewHandler.viewToPane(View.WARD);
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
        this.viewHandler = viewHandler;
        this.viewModel = (EmployeeViewModel) viewModelFactory.getViewModel(View.EMPLOYEE);
        employeeTypeComboBox.setItems(viewModel.getEmployeeType());
        ssnColumn.setCellValueFactory(new PropertyValueFactory<>("ssn"));
        fNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        employeeTable.setItems(viewModel.getEmployees());
    }

    public void onBackButton()
    {
    }
}
