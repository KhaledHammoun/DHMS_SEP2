package client.view_models.manager;

import client.model.manager.EmployeeModelManager;
import client.model.shared.GetEmployeeDataModel;
import javafx.beans.property.*;
import shared.Ward;

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

  private EmployeeModelManager employeeModelManager;
  private GetEmployeeDataModel getEmployeeDataModel;

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
    education =  new SimpleStringProperty();
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

  public ObjectProperty<Ward>  employeeWardProperty()
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
