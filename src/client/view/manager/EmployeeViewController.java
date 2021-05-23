package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.manager.EmployeeViewModel;
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
    @FXML
    private ViewHandler viewHandler;
    @FXML
    private EmployeeViewModel viewModel;

    @FXML
    public void onGetButton()
    {
        if (employeeTypeComboBox.getSelectionModel().getSelectedItem().equals("Doctor"))
        {
            viewModel.getListOfDoctors();
        }
        else
        {
            viewModel.getListOfNurses();
        }
    }

    @FXML
    public void onAddEmployeeButton()
    {
        viewHandler.openView(View.ADD_EDIT_EMPLOYEE);
    }

    @FXML
    public void onEditEmployeeButton()
    {
        Employee employee = employeeTable.getSelectionModel().getSelectedItem();
        if (employeeTypeComboBox.getSelectionModel().getSelectedItem().equals("Doctor"))
        {
            viewModel.editDoctor(employee.getSsn());
        }
        else
        {
            viewModel.editNurse(employee.getSsn());
        }
        viewHandler.openView(View.ADD_EDIT_EMPLOYEE);
    }

    @FXML
    public void onRemoveEmployeeButton()
    {
    }

    @FXML
    public void onBackButton()
    {
        viewHandler.openView(View.MANAGER_MAIN);
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {
        this.viewHandler = viewHandler;
        this.viewModel = (EmployeeViewModel) viewModelFactory.getViewModel(View.EMPLOYEE);
        employeeTypeComboBox.setItems(viewModel.getEmployeeType());
        employeeTypeComboBox.getSelectionModel().selectFirst();
        ssnColumn.setCellValueFactory(new PropertyValueFactory<>("ssn"));
        fNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        employeeTable.setItems(viewModel.employeesProperty());
    }
}
