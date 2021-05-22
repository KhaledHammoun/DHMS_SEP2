package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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

    }
}
