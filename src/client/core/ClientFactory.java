package client.core;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory
{
    private static Map<InterfaceEnum, Object> clients;

    static
    {
        clients = new HashMap<>();
        createClients();
    }

    private static void createClients()
    {

    }


}
