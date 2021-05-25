package shared;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    SimpleDateFormat sdf = new SimpleDateFormat("h:mm:ss");
    try
    {
      sdf.parse(time);
      return true;
    }
    catch (ParseException | NullPointerException e)
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

  public static boolean isValidSSN(long ssn)
  {
    return ssn >= 1000000000L && ssn <= 9999999999L;
  }
}
