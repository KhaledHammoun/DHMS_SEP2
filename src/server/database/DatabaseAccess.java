package server.database;

import java.sql.*;

public class DatabaseAccess
{
  private String driver = "org.postgresql.Driver";
  private String url = "jdbc:postgresql://hattie.db.elephantsql.com:5432/yunjxnkw";
  private String user = "yunjxnkw";
  private String pw= "D5YTBHvbbrXKkABkXyFqK-L4jQDNVsBH";



  private DatabaseAccess instance = new DatabaseAccess();

  private DatabaseAccess()
  {
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public synchronized Connection getConnection(){
    try {
      return DriverManager.getConnection(url,user,pw);
    } catch (SQLException e) {
      throw new RuntimeException("Failed to get DB connection!");
    }
  }



  public DatabaseAccess getInstance()
  {
    return instance;
  }
}
