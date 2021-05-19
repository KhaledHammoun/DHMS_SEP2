package client.networking.login;

import shared.AccessType;
import shared.LoginUser;
import shared.Patient;

public interface LoginClient
{
  AccessType loginClient(LoginUser user);

 void addPatient(Patient patient);
 void editPatient(Patient patient);
 void removePatient(Patient patient);
 Patient getPatientBySSN(int ssn);

}
