package client.view_models.manager;

import client.model.manager.WardModelManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import shared.Ward;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class WardViewModel
{
  private ObservableList<Ward> wards;
  private WardModelManager wardModelManager;

  public WardViewModel(WardModelManager wardModelManager)
  {
    this.wardModelManager = wardModelManager;
    //ToDo implement observer
    //wardModelManager.addListener("NewWard", this::onNewWard);
    wards = FXCollections.observableArrayList();

  }
  private void onNewWard(PropertyChangeEvent evt)
  {
    wards.add((Ward) evt.getNewValue());
  }
  public void loadWards()
  {
    List<Ward> wardsList = wardModelManager.getAllWards();
    wards.addAll(wardsList);
  }
  public ObservableList<Ward> getWards()
  {
    return wards;
  }
}
