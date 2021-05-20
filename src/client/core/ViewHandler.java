package client.core;

import client.view.MainViewController;
import client.view.View;
import client.view.ViewController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ViewHandler
{
    private Stage stage;
    private static ViewHandler viewHandler;
    private static Lock lock = new ReentrantLock();

    private ViewHandler()
    {
        this.stage = new Stage();
    }

    public static ViewHandler getViewHandler()
    {
        if (viewHandler == null)
        {
            synchronized (lock)
            {
                if (viewHandler == null)
                {
                    viewHandler = new ViewHandler();
                }
            }
        }
        return viewHandler;
    }

    public void start()
    {
        ViewFactory.init(stage);
        openView(View.LOGIN);
    }

    public void openView(View view)
    {
        Scene scene = ViewFactory.getScene(view);
        stage.setTitle(view.name());
        stage.setScene(scene);
        stage.show();
    }

    public void setSidebar(View sidebar) {
        Scene scene = ViewFactory.getScene(sidebar);
        MainViewController mainViewController = (MainViewController) ViewControllerFactory.getController(View.MAIN);
        mainViewController.mainBorderPane.setLeft(scene.getRoot());
        stage.sizeToScene();
    }

    private void viewToPane(View view)
    {
        Scene scene = ViewFactory.getScene(View.EMPLOYEE);
        MainViewController mainViewController = (MainViewController) ViewControllerFactory.getController(View.MAIN);
        mainViewController.mainBorderPane.setCenter(scene.getRoot());
        stage.sizeToScene();
    }
}
