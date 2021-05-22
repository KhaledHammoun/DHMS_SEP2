package client.core;

import client.view.View;
import client.view.ViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import shared.CamelCaseConverter;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewFactory
{
    // TODO: 22/05/2021 Remove printouts.
    private static Map<View, Scene> scenes;
    private static List<View> views;

    static
    {
        scenes = new HashMap<>();
    }

    public static void init()
    {
        createLoginScene();
        createManagerScene();
        createDoctorScene();
        createNurseScene();
    }

    private static void createLoginScene()
    {
        views = View.getLoginValues();
        try
        {
            for (View sceneName : views)
            {
                System.out.println(CamelCaseConverter.toCamelCase(sceneName.name()));
                Scene scene = null;
                Parent root = loadFXML("../view/login/" + CamelCaseConverter.toCamelCase(sceneName.name()) + "View.fxml");
                scene = new Scene(root);
                scenes.put(sceneName, scene);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void createManagerScene()
    {
        views = View.getManagerValues();
        try
        {
            for (View sceneName : views)
            {
                System.out.println(CamelCaseConverter.toCamelCase(sceneName.name()));
                Scene scene = null;
                Parent root = loadFXML("../view/manager/" + CamelCaseConverter.toCamelCase(sceneName.name()) + "View.fxml");
                scene = new Scene(root);
                scenes.put(sceneName, scene);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void createDoctorScene()
    {
        views = View.getDoctorValues();
        try
        {
            for (View sceneName : views)
            {
                System.out.println(CamelCaseConverter.toCamelCase(sceneName.name()));
                Scene scene = null;
                Parent root = loadFXML("../view/doctor/" + CamelCaseConverter.toCamelCase(sceneName.name()) + "View.fxml");
                scene = new Scene(root);
                scenes.put(sceneName, scene);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void createNurseScene()
    {
        views = View.getNurseValues();
        try
        {
            for (View sceneName : views)
            {
                System.out.println(CamelCaseConverter.toCamelCase(sceneName.name()));
                Scene scene = null;
                Parent root = loadFXML("../view/nurse/" + CamelCaseConverter.toCamelCase(sceneName.name()) + "View.fxml");
                scene = new Scene(root);
                scenes.put(sceneName, scene);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static Parent loadFXML(String path) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ViewFactory.class.getResource(path));
        Parent root = loader.load();

        ViewController ctrl = loader.getController();
        ctrl.init(ViewModelFactory.getViewModelFactory(), ViewHandler.getViewHandler());
        return root;
    }

    public static Scene getScene(View sceneName)
    {
        return scenes.get(sceneName);
    }
}
