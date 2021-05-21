package client.core;

import client.view.MainViewController;
import client.view.View;
import client.view.ViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ViewFactory
{
    private static Map<View, Scene> scenes;
    private static Stage stage;

    static
    {
        scenes = new HashMap<>();
    }

    public static void init(Stage theStage)
    {
        stage = theStage;
        createScene(View.LOGIN);
        createScene(View.MAIN);
        createScene(View.EMPLOYEE);
        createScene(View.WARD);
        createScene(View.SIDEBAR);
    }

    private static void createScene(View sceneName)
    {
        Scene scene = null;
        switch (sceneName)
        {
            case LOGIN:
                try
                {
                    Parent root = loadFXML("../view/LoginView.fxml");
                    scene = new Scene(root);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                break;
            case MAIN:
                try
                {
                    Parent root = loadFXML("../view/MainView.fxml");
                    scene = new Scene(root);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                break;
            case EMPLOYEE:
                try
                {
                    Parent root = loadFXML("../view/manager_view/EmployeeView.fxml");
                    scene = new Scene(root);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                break;
            case WARD:
                try
                {
                    Parent root = loadFXML("../view/manager_view/WardView.fxml");
                    scene = new Scene(root);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                break;
            case SIDEBAR:
                try
                {
                    Parent root = loadFXML("../view/manager_view/MangerSideBar.fxml");
                    scene = new Scene(root);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                break;
        }
        scenes.put(sceneName, scene);
    }

    private static Parent loadFXML(String path) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ViewFactory.class.getResource(path));
        Parent root = loader.load();

        ViewController ctrl = loader.getController();
        if (ctrl instanceof MainViewController)
        {
            ViewControllerFactory.addController(View.MAIN, ctrl);
        }
        ctrl.init(ViewModelFactory.getViewModelFactory(), ViewHandler.getViewHandler());
        return root;
    }

    public static Scene getScene(View sceneName)
    {
        return scenes.get(sceneName);
    }
}
