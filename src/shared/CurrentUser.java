package shared;

import server.database.DatabaseAccess;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CurrentUser implements Serializable
{
  private static CurrentUser currentUser;
  private String currentUserName;
  private long ssn;

  private CurrentUser()
  {
  }

  public static CurrentUser getInstance()
  {
    if (currentUser == null)
    {
      currentUser = new CurrentUser();
    }
    return currentUser;
  }

  public void setUser(LoginUser loginUser)
  {
    try (Connection connection = DatabaseAccess.getInstance().getConnection())
    {
      Statement statement = connection.createStatement();
      String query =
          "SELECT * FROM " + loginUser.getAccessType() + " WHERE email = '"
              + loginUser.getUsername() + "' AND password = '" + loginUser
              .getPassword() + "'";

      ResultSet r = statement.executeQuery(query);
      r.next();

      String firstName = r.getString("f_name");
      String middleName = r.getString("mid_name");
      String lastName = r.getString("l_name");

      currentUserName = middleName == null ?
          firstName + " " + lastName :
          firstName + " " + middleName + " " + lastName;
      ssn = r.getLong("ssn");
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }

  public String getCurrentUserName()
  {
    return currentUserName;
  }

  public long getSsn()
  {
    return ssn;
  }
}
