package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.manager.EmployeeViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
       viewModel.getEmployees();
    }

    @FXML
    public void onAddEmployeeButton()
    {
        viewModel.addEmployee();
        viewHandler.openView(View.ADD_EDIT_EMPLOYEE);
    }

    @FXML
    public void onEditEmployeeButton()
    {
        if (employeeTable.getSelectionModel().getSelectedItem() == null)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No employee selected");
            alert.show();
            return;
        }
        Employee employee = employeeTable.getSelectionModel().getSelectedItem();
        viewModel.editEmployee(employee);
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
        employeeTypeComboBox.valueProperty().bindBidirectional(viewModel.selectedEmployeeTypeProperty());
        employeeTypeComboBox.getSelectionModel().selectFirst();
    }
}
