package client.model.login;

import client.networking.login.LoginClient;
import shared.AccessType;
import shared.LoginUser;

import java.rmi.RemoteException;

public class LoginImpl implements Login
{
  private LoginClient loginClient;

  public LoginImpl(Object client)
  {
    loginClient = (LoginClient) client;
  }

  @Override public AccessType login(LoginUser user)
  {
    try
    {
      return loginClient.login(user);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while logging in. Please try again.");
    }
  }
}
