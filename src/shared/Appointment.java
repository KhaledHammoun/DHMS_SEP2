package shared;

import java.io.Serializable;
import java.sql.Timestamp;

public class Appointment implements Serializable
{
  private Timestamp from;
  private Timestamp to;
  private int doctorSSN;
  private int patientSSN;

  public Appointment(Timestamp from, Timestamp to, int doctorSSN, int patientSSN)
  {
    this.from = from;
    this.to = to;
    this.doctorSSN = doctorSSN;
    this.patientSSN = patientSSN;
  }

  public Timestamp getFrom()
  {
    return from;
  }

  public Timestamp getTo()
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

  public void setFrom(Timestamp from)
  {
    this.from = from;
  }

  public void setTo(Timestamp to)
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
