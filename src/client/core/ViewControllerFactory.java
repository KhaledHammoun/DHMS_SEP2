package client.core;

import client.view.View;
import client.view.ViewController;

import java.util.HashMap;
import java.util.Map;

public class ViewControllerFactory
{
    private static Map<View, ViewController> controllers;

    static
    {
        controllers = new HashMap<>();
    }

    public static void addController(View view, ViewController viewController)
    {
        if (!controllers.containsKey(view))
        {
            controllers.put(view, viewController);
        }
    }

    public static ViewController getController(View view)
    {
        return controllers.get(view);
    }
}
