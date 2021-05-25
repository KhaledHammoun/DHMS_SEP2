package client.model.shared;

import shared.util.PropertyChangeSubject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CallBackModelImpl implements CallBackModel, PropertyChangeListener
{
  private PropertyChangeSupport support;
  private PropertyChangeSubject subject;

  public CallBackModelImpl(Object client)
  {
    support = new PropertyChangeSupport(this);
    subject = (PropertyChangeSubject) client;
    subject.addPropertyChangeListener(null, this);
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    support.firePropertyChange(evt);
    System.out.println(evt.getPropertyName());
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    if (name == null)
    {
      support.addPropertyChangeListener(listener);
    }
    else
    {
      support.addPropertyChangeListener(name, listener);
    }
  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(name, listener);
  }
}
