package client.view_models.login;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DoctorMainViewModel
{
    private StringProperty currentUser;

    public DoctorMainViewModel()
    {
        currentUser = new SimpleStringProperty();
    }

    public void logout()
    {
        // TODO: 22/05/2021 Remove current user from CurrentUser
    }

    public StringProperty currentUserProperty()
    {
        return currentUser;
    }

    public void setCurrentUser(String currentUser)
    {
        // TODO: 22/05/2021 set current user names from the CurrentUser
        this.currentUser.set(currentUser);
    }
}
