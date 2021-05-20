package shared;

import java.io.Serializable;

public class Treatment implements Serializable
{
  private String medication;
  private String description;

  public Treatment(String medication, String description)
  {
    this.medication = medication;
    this.description = description;
  }

  public String getMedication()
  {
    return medication;
  }

  public String getDescription()
  {
    return description;
  }

  public void setMedication(String medication)
  {
    this.medication = medication;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  @Override public String toString()
  {
    return "Treatment{" + "medication='" + medication + '\'' + ", description='"
        + description + '\'' + '}';
  }
}
