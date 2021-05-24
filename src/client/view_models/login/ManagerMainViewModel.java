package client.view_models.login;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import shared.CurrentUser;

public class ManagerMainViewModel
{
    private StringProperty currentUser;

    public ManagerMainViewModel()
    {
        currentUser = new SimpleStringProperty();
    }

    public void logout()
    {
        CurrentUser.getInstance().setUser(null);
    }

    public StringProperty currentUserProperty()
    {
        return currentUser;
    }

    public void setCurrentUser()
    {
        this.currentUser.set(CurrentUser.getInstance().getFullName());
    }
}
