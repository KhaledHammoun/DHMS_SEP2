package shared;

import java.io.Serializable;

public class Disease implements Serializable
{
  private String name;
  private int severityLevel;
  private String description;

  public Disease(String name, int severityLevel, String description)
  {
    this.name = name;
    this.severityLevel = severityLevel;
    this.description = description;
  }

  public String getName()
  {
    return name;
  }

  public int getSeverityLevel()
  {
    return severityLevel;
  }

  public String getDescription()
  {
    return description;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setSeverityLevel(int severityLevel)
  {
    this.severityLevel = severityLevel;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  @Override public String toString()
  {
    return "Disease{" + "name='" + name + '\'' + ", severityLevel="
        + severityLevel + ", description='" + description + '\'' + '}';
  }
}
