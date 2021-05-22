package client.view_models.login;

import client.model.login.Login;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DoctorMainViewModel
{
  private StringProperty loginAs;
  private Login loginModel;

  public DoctorMainViewModel(Object loginModel)
  {
    this.loginModel = (Login) loginModel;
    loginAs = new SimpleStringProperty();
  }

  public StringProperty getLoginAs()
  {
    return loginAs;
  }

}
