package client.view.doctor;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.DateTime;
import shared.Sample;

import java.sql.Date;

public class DoctorAddEditSampleViewController
{
  @FXML
  public TableView<Sample> sampleTable;
  @FXML
  public TableColumn< String, Sample> sampleType;
  @FXML
  public TableColumn< Date,Sample> sampleDeadline;
  @FXML
  public TableColumn<Integer,Sample > samplePriority;
  @FXML
  public TableColumn<String,Sample > result;
  @FXML
  public Button addSampleButton;
  @FXML
  public Button editSampleButton;

  private ViewHandler viewHandler;

  private DoctorAddEditSampleViewModel viewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    //TODO viewModel = viewModelFactory...
    sampleTable.setItems(viewModel.getSamples());
    sampleType.setCellValueFactory(new PropertyValueFactory<>("type"));
    sampleDeadline.setCellValueFactory(new PropertyValueFactory<>("deadline"));
    samplePriority.setCellValueFactory(new PropertyValueFactory<>("priority"));
    result.setCellValueFactory(new PropertyValueFactory<>("result"));

  }

  public void onAddButton(ActionEvent actionEvent)
  {
    //TODO change view
  }

  public void onEditSampleButton(ActionEvent actionEvent)
  {
    //TODO change view
  }
}
