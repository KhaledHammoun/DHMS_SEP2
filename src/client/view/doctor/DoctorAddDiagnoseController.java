package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import client.view_models.doctor.DoctorAddDiagnoseViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class DoctorAddDiagnoseController implements ViewController
{
    @FXML
    private TextField diagnoseName;
    @FXML
    private TextField diagnoseDescription;
    @FXML
    private ComboBox<String> diagnoseSeverityLevel;
    @FXML
    private DatePicker diagnoseStartDate;
    @FXML
    private DatePicker endDate;
    @FXML
    private Button saveButton;

    private ViewHandler viewHandler;
    private DoctorAddDiagnoseViewModel doctorAddDiagnoseViewModel;

    @FXML
    public void onSaveButton()
    {
    }

    @FXML
    public void onBackButton()
    {
    }

    @FXML
    public void onClearButton()
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {
        this.viewHandler = viewHandler;
        //TODO doctorAddDiagnoseViewModel = viewModelFactory...
        diagnoseName.textProperty().bindBidirectional(doctorAddDiagnoseViewModel.nameProperty());
        diagnoseDescription.textProperty().bindBidirectional(doctorAddDiagnoseViewModel.descriptionProperty());
        diagnoseSeverityLevel.valueProperty().bindBidirectional(doctorAddDiagnoseViewModel.severityLevelProperty());
        diagnoseStartDate.valueProperty().bindBidirectional(doctorAddDiagnoseViewModel.startDateProperty());
        endDate.valueProperty().bindBidirectional(doctorAddDiagnoseViewModel.endDateProperty());
    }
}
