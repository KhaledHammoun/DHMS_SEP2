package shared;

import java.io.Serializable;

public class CurrentUser implements Serializable
{
  private Object user;
  private static CurrentUser currentUser;

  private CurrentUser()
  {
  }

  public static CurrentUser getInstance()
  {
    if(currentUser==null)
    {
      currentUser = new CurrentUser();
    }
    return currentUser;
  }

  public Object getCurrentUser()
  {
    return user;
  }
  public void setUser(Object user)
  {
   this.user = user;
  }
}
