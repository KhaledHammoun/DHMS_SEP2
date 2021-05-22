package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.doctor.TreatPatientViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Diagnosis;

public class TreatPatientViewController implements ViewController
{
    @FXML
    private TextField medicationTextField;
    @FXML
    private Label selectDiagnosisLabel;
    @FXML
    private TableView<Diagnosis> diagnosisTable;
    @FXML
    private TableColumn<Diagnosis, String> diagnosisName;
    @FXML
    private TableColumn<Diagnosis, Integer> diagnosisSeverity;
    @FXML
    private TableColumn<Diagnosis, String> diagnosisDescription;
    @FXML
    private Button addMedicationButton;
    @FXML
    private TextArea descriptionTextArea;

    private ViewHandler viewHandler;
    private TreatPatientViewModel treatPatientViewModel;

    @FXML
    public void onAddButton()
    {
        //TODO
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
        treatPatientViewModel = (TreatPatientViewModel) viewModelFactory.getViewModel(View.TREAT_PATIENT);

        diagnosisTable.setItems(treatPatientViewModel.getDiagnoses());
        diagnosisName.setCellValueFactory(new PropertyValueFactory<>("name"));
        diagnosisSeverity.setCellValueFactory(new PropertyValueFactory<>("severityLevel"));
        diagnosisDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        medicationTextField.textProperty().bindBidirectional(
                treatPatientViewModel.medicationProperty());
        descriptionTextArea.textProperty().bindBidirectional(treatPatientViewModel.descriptionProperty());

    }
}
