package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.View;
import client.view.ViewController;
import client.view_models.manager.WardViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import shared.Ward;

public class WardViewController implements ViewController
{
    @FXML
    private TableView<Ward> wardTable;
    @FXML
    private TableColumn<String, Ward> wardNameColumn;
    @FXML
    private TableColumn<Integer, Ward> roomNumberColumn;

    private ViewHandler viewHandler;
    private WardViewModel wardViewModel;

    @FXML
    public void onAddWardButton()
    {
        viewHandler.openView(View.ADD_EDIT_WARD);
    }

    @FXML
    public void onEditWardButton()
    {
        wardViewModel.editWard(wardTable.getSelectionModel().getSelectedItem());
        viewHandler.openView(View.ADD_EDIT_WARD);
    }

    @FXML
    public void onRemoveWardButton()
    {
    }

    @FXML
    public void onBackButton()
    {
        viewHandler.openView(View.MANAGER_MAIN);
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {
        this.viewHandler=viewHandler;
        this.wardViewModel = (WardViewModel) viewModelFactory.getViewModel(View.WARD);
        wardTable.setItems(wardViewModel.getWards());
        wardNameColumn.setCellValueFactory(new PropertyValueFactory<>("wardName"));
        roomNumberColumn.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));

        wardViewModel.loadWards();
    }
}
