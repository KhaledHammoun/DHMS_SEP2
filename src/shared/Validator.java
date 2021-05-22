package shared;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator
{
  public static boolean isValidPassword(String password)
  {
    String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,14}$";
    return matches(password, regex);
  }
  public boolean isValidTelNo(String telNo)
  {
    //TODO
    return false;

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

  public boolean isValidSSN(int SSN )
  {
    //TODO
    return false;
  }
}
