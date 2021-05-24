package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.manager.AddEditWardViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Ward;

public class AddEditWardViewController implements ViewController
{
    @FXML
    private TableView<Ward> allWardsTable;
    @FXML
    private TableColumn<Ward, String> wardNameColumn;
    @FXML
    private TableColumn<Ward, Integer> wardRoomNumberColumn;
    @FXML
    private TextField wardNameTextField;
    @FXML
    private TextField wardRoomNumber;

    private ViewHandler viewHandler;
    private AddEditWardViewModel viewModel;

    @FXML
    public void onSaveButton()
    {
        if (isInvalidInput())
        {
            throwAlert(Alert.AlertType.ERROR, "No ward selected");
            return;
        }

        if (throwAlert(Alert.AlertType.CONFIRMATION, "Are you sure you want to save the changes?"))
        {
            viewModel.saveChanges();
        }
    }

    private boolean throwAlert(Alert.AlertType type, String text)
    {
        Alert alert = new Alert(type);
        alert.setContentText(text);
        alert.show();
        return alert.getResult() == ButtonType.YES;
    }

    private boolean isInvalidInput()
    {
        return wardNameTextField.getText() == null || wardRoomNumber.getText() == null || wardNameTextField.getText().isEmpty() || wardRoomNumber.getText().isEmpty();
    }

    @FXML
    public void onClearButton()
    {
        viewModel.clear();
    }

    @FXML
    public void onBackButton()
    {
        viewModel.clear();
        viewHandler.openView(View.WARD);
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {
        this.viewHandler = viewHandler;
        this.viewModel = (AddEditWardViewModel) viewModelFactory.getViewModel(View.ADD_EDIT_WARD);
        allWardsTable.setItems(viewModel.getAllWards());
        wardNameColumn.setCellValueFactory(new PropertyValueFactory<>("wardName"));
        wardRoomNumberColumn.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        wardNameTextField.textProperty().bindBidirectional(viewModel.wardNameProperty());
        wardRoomNumber.textProperty().bindBidirectional(viewModel.roomNumberProperty());

        viewModel.fillWards();
    }
}
