/**
 * This class represents an email address The email is a composition of a user name and a domain.
 */
public class Email {
  private String userName;
  private String domain;

  /**
   * Construct an Email object that stores an email address.
   *
   * @param userName the user name of the email address
   * @param domain the domain of the email address
   */

  public Email(String userName, String domain) {
    this.userName = userName;
    this.domain = domain;    
  }

  /**
   * Concatenate the username, "@" and the domain.
   *
   * @return the email in a a single string with the combination of userName@domain
   */

  public String getEmail() {
    String res = this.userName + "@" + this.domain;
    return res;
  }

}