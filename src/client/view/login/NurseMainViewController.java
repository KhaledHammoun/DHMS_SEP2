package client.view.login;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.login.NurseMainViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NurseMainViewController implements ViewController
{
    @FXML
    private Label loggedInAsLabel;
    private ViewHandler viewHandler;
    private NurseMainViewModel nurseMainViewModel;

    @FXML
    public void onPatientsButton()
    {
        viewHandler.openView(View.ALL_APPOINTMENTS);
    }

    @FXML
    public void onAddPatientButton()
    {
        viewHandler.openView(View.ADD_PATIENT);

    }

    @FXML
    public void onAppointmentsButton()
    {
        viewHandler.openView(View.MAKE_APPOINTMENT);
    }

    @FXML
    public void onLogoutButton()
    {
        nurseMainViewModel.logout();
        viewHandler.openView(View.LOGIN);
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {
        this.viewHandler = viewHandler;
        this.nurseMainViewModel = (NurseMainViewModel) viewModelFactory.getViewModel(View.NURSE_MAIN);
    }
}
