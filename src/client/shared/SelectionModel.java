package client.shared;

public class SelectionModel
{
  private Object selectedObject;
  private static SelectionModel instance = new SelectionModel();

  private SelectionModel()
  {
  }

  public void set(Object selectedObject)
  {
    this.selectedObject = selectedObject;
  }

  public Object get()
  {
    Object selectedObject = this.selectedObject;
    this.selectedObject = null;
    return selectedObject;
  }

  public static SelectionModel getInstance()
  {
    return instance;
  }

  public boolean isEmpty()
  {
    return selectedObject == null;
  }
}
