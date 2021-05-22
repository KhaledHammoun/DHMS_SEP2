package client.view_models.manager;

import client.model.manager.EmployeeModelManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Employee;

import java.util.ArrayList;

public class EmployeeViewModel
{
    private ObservableList<String> employeeType;
    private ObservableList<Employee> employees;
    private EmployeeModelManager modelManager;

    public EmployeeViewModel(Object modelManager)
    {
        this.modelManager = (EmployeeModelManager) modelManager;
        employeeType = FXCollections.observableArrayList("Doctor", "Nurse");
        employees = FXCollections.observableArrayList();
    }

    public ObservableList<Employee> getEmployees()
    {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees)
    {
        this.employees.addAll(employees);
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public ObservableList<String> getEmployeeType()
    {
        return employeeType;
    }
}
