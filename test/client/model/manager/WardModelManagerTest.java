package client.model.manager;

import client.networking.manager.WardClientManager;
import client.networking.manager.WardClientRMI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shared.Ward;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WardModelManagerTest
{
  private WardModelManager test;

  @BeforeEach public void setUp()
  {
    WardClientManager client = new WardClientRMI();
    test = new WardModelManagerImpl(client);
  }

  @Test public void getAllWards()
  {
    ArrayList<Ward> allWards = test.getAllWards();

    assertNotNull(allWards);
  }

  @Test public void addWard()
  {
    Ward wardToAdd = new Ward("Examination", 133);
    test.addWard(wardToAdd);

    assertTrue(isInDatabase(wardToAdd));
  }

  @Test public void editWard()
  {
    Ward oldWard = new Ward("Examination", 133);

    Ward newWard = new Ward(oldWard.getWardName(), oldWard.getRoomNumber());

    newWard.setWardName("Nursery");
    newWard.setRoomNumber(199);

    test.editWard(oldWard, newWard);
    assertTrue(isInDatabase(newWard));
  }

  @Test public void removeWard()
  {
    Ward wardToRemove = new Ward("Examination", 133);
    test.addWard(wardToRemove);

    test.removeWard(wardToRemove);
    assertFalse(isInDatabase(wardToRemove));
  }

  private boolean isInDatabase(Ward isInDBWard)
  {
    ArrayList<Ward> allWards = test.getAllWards();
    for (Ward ward : allWards)
    {
      if (ward.getRoomNumber() == isInDBWard.getRoomNumber() && ward
          .getWardName().equals(isInDBWard.getWardName()))
      {
        return true;
      }
    }
    return false;
  }
}