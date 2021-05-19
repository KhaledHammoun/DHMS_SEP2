package shared;

import java.io.Serializable;

public class Appointment implements Serializable
{
  private DateTime from;
  private DateTime to;
  private int doctorSSN;
  private int patientSSN;

  public Appointment(DateTime from, DateTime to, int doctorSSN, int patientSSN)
  {
    this.from = from;
    this.to = to;
    this.doctorSSN = doctorSSN;
    this.patientSSN = patientSSN;
  }

  public DateTime getFrom()
  {
    return from;
  }

  public DateTime getTo()
  {
    return to;
  }

  public int getDoctorSSN()
  {
    return doctorSSN;
  }

  public int getPatientSSN()
  {
    return patientSSN;
  }

  public void setFrom(DateTime from)
  {
    this.from = from;
  }

  public void setTo(DateTime to)
  {
    this.to = to;
  }

  public void setDoctorSSN(int doctorSSN)
  {
    this.doctorSSN = doctorSSN;
  }

  public void setPatientSSN(int patientSSN)
  {
    this.patientSSN = patientSSN;
  }

  @Override public String toString()
  {
    return "Appointment{" + "from=" + from + ", to=" + to + ", doctorSSN="
        + doctorSSN + ", patientSSN=" + patientSSN + '}';
  }
}
