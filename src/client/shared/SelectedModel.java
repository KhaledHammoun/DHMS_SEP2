package client.shared;

import shared.AccessType;

public class SelectedModel
{
  private long ssn;
  private AccessType type;
  private SelectedModel instance = new SelectedModel();

  private SelectedModel()
  {
  }

  public void set(AccessType type, long ssn)
  {
    this.type = type;
    this.ssn = ssn;
  }

  public SelectedModel getInstance()
  {
    return instance;
  }

  public long getSsn()
  {
    return ssn;
  }

  public AccessType getType()
  {
    return type;
  }
}
