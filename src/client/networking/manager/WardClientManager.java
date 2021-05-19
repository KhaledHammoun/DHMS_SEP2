package client.networking.manager;

import shared.Ward;

import java.util.ArrayList;

public interface WardClientManager
{
  void addWard(Ward ward);
  void addRoomForAWard(Ward ward);
  String editWard(Ward ward);
  void editRoomNumber(int roomNumber);
  void removeWard(Ward ward);
  void removeRoom(int roomNumber);
  ArrayList<Ward> getAllWards();

}
