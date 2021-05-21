package client.view;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

public class MainViewController implements ViewController
{
    @FXML
    public BorderPane mainBorderPane;
    @FXML
    public ScrollPane mainPane;

    @Override
    public void init(ViewModelFactory viewModelFactory, ViewHandler viewHandler)
    {

    }
}
