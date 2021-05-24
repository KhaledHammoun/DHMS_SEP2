package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.sharted.View;
import client.view.sharted.ViewController;
import client.view_models.doctor.AddDiagnoseViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddDiagnoseViewController implements ViewController
{
    @FXML
    private TextField diagnoseName;
    @FXML
    private TextArea diagnoseDescription;
    @FXML
    private ComboBox<String> diagnoseSeverityLevel;
    @FXML
    private DatePicker diagnoseStartDate;
    @FXML
    private DatePicker endDate;

    private ViewHandler viewHandler;

    private AddDiagnoseViewModel addDiagnoseViewModel;

    @FXML
    public void onSaveButton()
    {
        addDiagnoseViewModel.save();
    }

    @FXML
    public void onBackButton()
    {
        viewHandler.openView(View.PATIENTS);
    }

    @FXML
    public void onClearButton()
    {
        addDiagnoseViewModel.clear();
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {
        this.viewHandler = viewHandler;
        addDiagnoseViewModel = (AddDiagnoseViewModel) viewModelFactory.getViewModel(View.ADD_DIAGNOSE);
        diagnoseName.textProperty().bindBidirectional(addDiagnoseViewModel.nameProperty());
        diagnoseDescription.textProperty().bindBidirectional(addDiagnoseViewModel.descriptionProperty());
        diagnoseSeverityLevel.valueProperty().bindBidirectional(addDiagnoseViewModel.severityLevelProperty());
        diagnoseStartDate.valueProperty().bindBidirectional(addDiagnoseViewModel.startDateProperty());
        endDate.valueProperty().bindBidirectional(addDiagnoseViewModel.endDateProperty());

        addDiagnoseViewModel.loadSelectedPatient();
        diagnoseSeverityLevel.getItems().addAll(addDiagnoseViewModel.getSeverityLevels());
    }
}
