package shared;

public class Address
{
  private String street;
  private String number;
  private String zipcode;
  private String city;

  public Address(String street, String number, String zipcode, String city)
  {
    this.street = street;
    this.number = number;
    this.zipcode = zipcode;
    this.city = city;
  }

  public String getStreet()
  {
    return street;
  }

  public String getNumber()
  {
    return number;
  }

  public String getZipcode()
  {
    return zipcode;
  }

  public String getCity()
  {
    return city;
  }

  @Override public String toString()
  {
    return "Address{" + "street='" + street + '\'' + ", number='" + number
        + '\'' + ", zipcode='" + zipcode + '\'' + ", city='" + city + '\''
        + '}';
  }
}
