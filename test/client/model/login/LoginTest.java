package client.model.login;

import client.networking.login.LoginClient;
import client.networking.login.LoginClientImpl;
import org.junit.jupiter.api.Test;
import server.networking.login.LoginServerRMI;
import shared.AccessType;
import shared.LoginUser;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest
{
  @Test public void login()
  {
    LoginClient client = new LoginClientImpl();
    Login test = new LoginImpl(client);

    LoginUser user = new LoginUser("ceo@ceo.com", "Ceo12345", AccessType.MANAGER);
    AccessType login = test.login(user);
    assertEquals(AccessType.MANAGER, login);

    LoginUser wrongUser = new LoginUser("ceo@ceo.com", "Ceo2345", AccessType.MANAGER);
    AccessType wrongLogin = test.login(wrongUser);
    assertEquals(AccessType.NO_ACCESS, wrongLogin);
  }
}