package client.networking.login;

import shared.AccessType;
import shared.LoginUser;

public interface LoginClient
{
  AccessType loginClient(LoginUser user);

}
