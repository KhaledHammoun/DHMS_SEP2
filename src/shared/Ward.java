package shared;

import java.io.Serializable;
import java.util.ArrayList;

public class Ward implements Serializable
{
  private String wardName;
  private int roomNumber;
  private ArrayList<Doctor> doctors;

  public Ward(String wardName, int roomNumber)
  {
    this.wardName = wardName;
    this.roomNumber = roomNumber;
    doctors = new ArrayList<>();
  }

  public String getWardName()
  {
    return wardName;
  }

  public int getRoomNumber()
  {
    return roomNumber;
  }

  public ArrayList<Doctor> getDoctors()
  {
    return doctors;
  }

  @Override public String toString()
  {
    return "Ward{" + "wardName='" + wardName + '\'' + ", roomNumber="
        + roomNumber + '}';
  }
}
