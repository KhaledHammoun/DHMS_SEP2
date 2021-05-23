package client.view_models.manager;

import client.model.manager.EmployeeModelManager;
import client.model.shared.GetEmployeeDataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Employee;

import java.util.ArrayList;

public class EmployeeViewModel
{
    private ObservableList<String> employeeType;
    private ObservableList<Employee> employees;
    private EmployeeModelManager employeeModelManager;
    private GetEmployeeDataModel getEmployeeDataModel;

    public EmployeeViewModel(Object employeeModelManager, Object getEmployeeDataModel)
    {
        this.getEmployeeDataModel = (GetEmployeeDataModel) getEmployeeDataModel;
        this.employeeModelManager = (EmployeeModelManager) employeeModelManager;
        employeeType = FXCollections.observableArrayList("Doctor", "Nurse");
        employees = FXCollections.observableArrayList();
    }

    public ObservableList<Employee> employeesProperty()
    {
        return employees;
    }

    public <T extends Employee> void setEmployees(ArrayList<T> employees)
    {
        this.employees.clear();
        this.employees.addAll(employees);
    }

    public void getListOfDoctors()
    {
        setEmployees(getEmployeeDataModel.getListOfAllDoctors());
    }

    public void getListOfNurses()
    {
        setEmployees(getEmployeeDataModel.getListOfAllNurses());
    }

    public void editDoctor(Long ssn)
    {
        getEmployeeDataModel.getDoctorBySSN(ssn);
    }

    public void editNurse(Long ssn)
    {
        getEmployeeDataModel.getNurseBySSN(ssn);
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
