package client.model.manager;

import shared.Ward;

import java.util.ArrayList;

public interface WardModelManager
{
  void addWard(Ward ward);
  void addRoomForAWard(Ward ward);
  String editWard(Ward ward);
  void editRoomNumber(Ward ward);
  void removeWard(Ward ward);
  void removeRoom(Ward ward);
  ArrayList<Ward> getAllWards();
}
