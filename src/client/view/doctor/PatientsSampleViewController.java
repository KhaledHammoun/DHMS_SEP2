package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.doctor.PatientsSampleViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Sample;

import java.sql.Date;

public class PatientsSampleViewController implements ViewController
{
  @FXML
  private TableView<Sample> sampleTable;
  @FXML
  private TableColumn< String, Sample> sampleType;
  @FXML
  private TableColumn< Date,Sample> sampleDeadline;
  @FXML
  private TableColumn<Integer,Sample > samplePriority;
  @FXML
  private TableColumn<String,Sample > result;
  @FXML
  private Button addSampleButton;
  @FXML
  private Button editSampleButton;

  private ViewHandler viewHandler;

  private PatientsSampleViewModel viewModel;

  public void onAddButton()
  {
    //TODO change view
  }

  public void onEditSampleButton()
  {
    //TODO change view
  }

  public void onBackButton()
  {
  }

  @Override
  public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
    viewModel = (PatientsSampleViewModel) viewModelFactory.getViewModel(View.PATIENTS_SAMPLE);
    sampleTable.setItems(viewModel.getSamples());
    sampleType.setCellValueFactory(new PropertyValueFactory<>("type"));
    sampleDeadline.setCellValueFactory(new PropertyValueFactory<>("deadline"));
    samplePriority.setCellValueFactory(new PropertyValueFactory<>("priority"));
    result.setCellValueFactory(new PropertyValueFactory<>("result"));
  }
}
