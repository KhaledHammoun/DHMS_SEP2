package server.networking.login;

import shared.AccessType;
import shared.LoginUser;

public interface LoginServer
{
    AccessType login(LoginUser user);
}
