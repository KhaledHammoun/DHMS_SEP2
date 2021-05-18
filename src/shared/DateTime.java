package shared;

public class DateTime
{
  private int day;
  private int month;
  private int year;
  private int hour;
  private int min;


  public DateTime(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
    hour = 0;
    min=0;
  }

  public DateTime(int day, int month, int year, int hour, int min)
  {
    this.day = day;
    this.month = month;
    this.year = year;
    this.hour = hour;
    this.min = min;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMin()
  {
    return min;
  }

///only date
  @Override public String toString()
  {
    return "DateTime{" + "day=" + day + ", month=" + month + ", year=" + year
        + '}';
  }
}