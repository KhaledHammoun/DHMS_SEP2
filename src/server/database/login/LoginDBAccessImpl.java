package server.database.login;

import server.database.DatabaseAccess;
import shared.AccessType;
import shared.LoginUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDBAccessImpl implements LoginDBAccess
{
  @Override public AccessType login(LoginUser user)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection();
        PreparedStatement preparedStatement = connection
            .prepareStatement("SELECT password FROM ? WHERE ssn = ?"))
    {
      preparedStatement.setString(1, user.getAccessType().toString());
      preparedStatement.setString(2, user.getUsername());

      String passwordFromDB = preparedStatement.executeQuery()
          .getString("password");

      if (passwordFromDB.equals(user.getPassword()))
      {
        return user.getAccessType();
      }
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return AccessType.NO_ACCESS;
  }
}
