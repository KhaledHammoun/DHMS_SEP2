package client.view_models.manager;

import client.model.manager.EmployeeModelManager;
import client.model.shared.GetEmployeeDataModel;
import client.shared.SelectionModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Doctor;
import shared.Employee;
import shared.Nurse;

import java.util.ArrayList;

public class EmployeeViewModel
{
    private ObservableList<String> employeeType;
    private ObservableList<Employee> employees;
    private EmployeeModelManager employeeModelManager;
    private GetEmployeeDataModel getEmployeeDataModel;
    private StringProperty selectedEmployeeType;

    public EmployeeViewModel(Object employeeModelManager, Object getEmployeeDataModel)
    {
        this.getEmployeeDataModel = (GetEmployeeDataModel) getEmployeeDataModel;
        this.employeeModelManager = (EmployeeModelManager) employeeModelManager;
        employeeType = FXCollections.observableArrayList("Doctor", "Nurse");
        employees = FXCollections.observableArrayList();
        selectedEmployeeType = new SimpleStringProperty();
    }

    public ObservableList<Employee> employeesProperty()
    {
        return employees;
    }

    private <T extends Employee> void setEmployees(ArrayList<T> employees)
    {
        this.employees.clear();
        this.employees.addAll(employees);
    }

    public void getEmployees()
    {
        if (isDoctor())
        {
            setEmployees(getEmployeeDataModel.getListOfAllDoctors());
        }
        else
        {
            setEmployees(getEmployeeDataModel.getListOfAllNurses());
        }
    }

    public <T extends Employee> void editEmployee(T employee)
    {
        SelectionModel.getInstance().set(employee);
    }

    public void addEmployee()
    {
        if (isDoctor())
        {
            SelectionModel.getInstance().set(new Doctor());
        }
        else
        {
            SelectionModel.getInstance().set(new Nurse());
        }
    }

    public ObservableList<String> getEmployeeType()
    {
        return employeeType;
    }

    public StringProperty selectedEmployeeTypeProperty()
    {
        return selectedEmployeeType;
    }

    private boolean isDoctor()
    {
        return selectedEmployeeType.getValue().equals("Doctor");
    }
}
