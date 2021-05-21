package client.view.manager;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import shared.Ward;

public class WardViewController implements ViewController
{
    @FXML
    private TableView<Ward> wardTable;
    @FXML
    private TableColumn<String, Ward> wardNameColumn;
    @FXML
    private TableColumn<Integer, Ward> roomNumberColumn;

    @FXML
    public void onAddWardButton()
    {
    }

    @FXML
    public void onEditWardButton()
    {
    }

    @FXML
    public void onRemoveWardButton()
    {
    }

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
