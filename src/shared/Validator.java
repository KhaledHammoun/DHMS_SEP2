package shared;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator
{
  public static boolean isValidPassword(String password)
  {
    String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,14}$";
    return matches(password, regex);
  }

  public static boolean isValidTelTimeFormat(String time)
  {
    try
    {
      LocalTime.parse(time);
      return true;
    }
    catch (DateTimeParseException | NullPointerException e)
    {
      return false;
    }
  }

  public static boolean isValidEmail(String email)
  {
    String regex = "^(.+)@(.+)$";
    return matches(email, regex);
  }

  private static boolean matches(String toValidate, String regex)
  {
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(toValidate);
    return matcher.matches();
  }

  public static boolean isValidSSN(long SSN)
  {
    return SSN > 999999999L && SSN < 10000000000L;
  }
}
