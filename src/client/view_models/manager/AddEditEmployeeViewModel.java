package client.view_models.manager;

import client.model.manager.EmployeeModelManager;
import client.model.shared.GetEmployeeDataModel;
import client.shared.SelectionModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import shared.*;

import java.sql.Date;
import java.time.LocalDate;

public class AddEditEmployeeViewModel
{
    private StringProperty employeeSnn;
    private StringProperty employeeFirstName;
    private StringProperty employeeMiddleName;
    private StringProperty employeeLastName;
    private ObjectProperty<LocalDate> employeeDob;
    private StringProperty employeeStreet;
    private StringProperty employeeStreetNo;
    private StringProperty employeeCity;
    private StringProperty employeeZipCode;
    private StringProperty contactFirstName;
    private StringProperty contactLastName;
    private StringProperty contactPhoneNo;
    private ObjectProperty<Ward> employeeWard;
    //TODO check if ObjectProperty<Ward> causes no problems!!!
    private StringProperty username;
    private StringProperty password;
    private StringProperty experience;
    private StringProperty education;
    private StringProperty[] textFields;
    private boolean toAdd;
    private boolean isDoctor;

    private EmployeeModelManager employeeModelManager;
    private GetEmployeeDataModel getEmployeeDataModel;

    // TODO: 23/05/2021 Fetch all the wards from the database and add them to the ward property
    public AddEditEmployeeViewModel(Object employeeModelManager, Object getEmployeeDataModel)
    {
        this.employeeModelManager = (EmployeeModelManager) employeeModelManager;
        this.getEmployeeDataModel = (GetEmployeeDataModel) getEmployeeDataModel;
        employeeSnn = new SimpleStringProperty();
        employeeFirstName = new SimpleStringProperty();
        employeeMiddleName = new SimpleStringProperty();
        employeeLastName = new SimpleStringProperty();
        employeeDob = new SimpleObjectProperty<>();
        employeeStreet = new SimpleStringProperty();
        employeeStreetNo = new SimpleStringProperty();
        employeeCity = new SimpleStringProperty();
        employeeZipCode = new SimpleStringProperty();
        contactFirstName = new SimpleStringProperty();
        contactLastName = new SimpleStringProperty();
        contactPhoneNo = new SimpleStringProperty();

        employeeWard = new SimpleObjectProperty<>();
        username = new SimpleStringProperty();
        password = new SimpleStringProperty();
        experience = new SimpleStringProperty();
        education = new SimpleStringProperty();
        textFields = new StringProperty[] {employeeSnn, employeeFirstName, employeeMiddleName, employeeLastName,
                                           employeeStreet, employeeStreetNo, employeeCity, employeeZipCode,
                                           contactFirstName, contactLastName, contactPhoneNo, username, password,
                                           experience, education};
    }

    public void setChangeType()
    {
        Employee employee = (Employee) SelectionModel.getInstance().get();
        if (employee instanceof Doctor)
        {
            isDoctor = true;
        }
        if (employee == null || employee.getSsn() == 0L)
        {
            toAdd = true;
        }
        else
        {
            fillCommon(employee);
        }
        System.out.println("Is doctor: " + isDoctor + " To add: " + toAdd);
    }

    private <T extends Employee> void fillCommon(T employee)
    {
        employeeSnn.setValue(String.valueOf(employee.getSsn()));
        employeeFirstName.setValue(employee.getFirstName());
        employeeMiddleName.setValue(employee.getMiddleName());
        employeeLastName.setValue(employee.getLastName());
        employeeDob.setValue(employee.getDob().toLocalDate());
        employeeStreet.setValue(employee.getAddress().getStreet());
        employeeStreetNo.setValue(employee.getAddress().getNumber());
        employeeCity.setValue(employee.getAddress().getCity());
        employeeZipCode.setValue(employee.getAddress().getZipcode());
        education.setValue(employee.getEducation());
        contactFirstName.setValue(employee.getContactFirstName());
        contactLastName.setValue(employee.getContactLastName());
        contactPhoneNo.setValue(employee.getContactPhoneNumber());
        username.setValue(employee.getEmail());
        password.setValue(employee.getPassword());
        fillSpecific(employee);
    }

    private void fillSpecific(Employee employee)
    {
        if (employee instanceof Doctor)
        {
            Doctor doctor = (Doctor) employee;
            experience.setValue(doctor.getSpecialization());
            employeeWard.setValue(doctor.getWard());
        }
        else
        {
            Nurse nurse = (Nurse) employee;
            experience.setValue(nurse.getExperience());
        }
    }

    public void saveChanges()
    {
        getDataObject();
        if (toAdd && isDoctor)
        {
            employeeModelManager.addDoctor(getDataObject());
        }
        else if (toAdd && !isDoctor)
        {
            employeeModelManager.addNurse(getDataObject());
        }
        else if (!toAdd && isDoctor)
        {
            employeeModelManager.editDoctor(getDataObject());
        }
        else
        {
            employeeModelManager.editNurse(getDataObject());
        }
       clear();
    }

    public void clear()
    {
        toAdd = false;
        isDoctor = false;
        employeeDob.set(null);
        employeeWard.set(null);
        clearTextFields();
    }

    private void clearTextFields()
    {
        for (StringProperty filed : textFields)
        {
            filed.setValue("");
        }
    }

    public <T extends Employee> T getDataObject()
    {
        Long ssn = Long.valueOf(employeeSnn.get());
        Date dob = Date.valueOf(employeeDob.get());
        Address address =
                new Address(employeeStreet.get(), employeeStreetNo.get(), employeeZipCode.get(), employeeCity.get());

        if (isDoctor)
        {
           return (T) new Doctor(employeeFirstName.get(), employeeMiddleName.get(), employeeLastName.get(), ssn, dob,
                                 address, contactFirstName.get(), null, contactLastName.get(), contactPhoneNo.get(), null,
                                 education.get(), experience.get(), employeeWard.get(), username.get(), password.get());
        }
        else
        {
            return (T) new Nurse(ssn, 0L, employeeFirstName.get(), employeeMiddleName.get(), employeeLastName.get(), dob,
                                 address, contactFirstName.get(), null, contactLastName.get(), contactPhoneNo.get(), null,
                                 education.get(), experience.get(), username.get(), password.get());
        }
    }

    public StringProperty employeeSnnProperty()
    {
        return employeeSnn;
    }

    public StringProperty employeeFirstNameProperty()
    {
        return employeeFirstName;
    }

    public StringProperty employeeMiddleNameProperty()
    {
        return employeeMiddleName;
    }

    public StringProperty employeeLastNameProperty()
    {
        return employeeLastName;
    }

    public ObjectProperty<LocalDate> employeeDobProperty()
    {
        return employeeDob;
    }

    public StringProperty employeeStreetProperty()
    {
        return employeeStreet;
    }

    public StringProperty employeeStreetNoProperty()
    {
        return employeeStreetNo;
    }

    public StringProperty employeeCityProperty()
    {
        return employeeCity;
    }

    public StringProperty employeeZipCodeProperty()
    {
        return employeeZipCode;
    }

    public StringProperty contactFirstNameProperty()
    {
        return contactFirstName;
    }

    public StringProperty contactLastNameProperty()
    {
        return contactLastName;
    }

    public StringProperty contactPhoneNoProperty()
    {
        return contactPhoneNo;
    }

    public ObjectProperty<Ward> employeeWardProperty()
    {
        return employeeWard;
    }

    public StringProperty usernameProperty()
    {
        return username;
    }

    public StringProperty passwordProperty()
    {
        return password;
    }

    public StringProperty experienceProperty()
    {
        return experience;
    }

    public StringProperty educationProperty()
    {
        return education;
    }
}
