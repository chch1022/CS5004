import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * A JUnit test class for the Person class.
 */

public class PersonTest {

  private Person john;
  

  @Before
  public void setUp() {
    john = new Person("John", "Doe", 1989, "123456789", new Email("Doe", "gmail.com"));
  }

  @Test
  public void testFirst() {
    assertEquals("John", john.getFirstName());

  }

  @Test
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  @Test
  public void testYearOfBirth() {
    assertEquals(1989, john.getYearOfBirth());
  }
  
  @Test
  public void testPhone() {
    String expectedPhone = "123456789";
    assertEquals(expectedPhone, john.getPhone());
  }
  
  @Test
  public void testEmail() {
    Email expectedEmail = new Email("Doe", "gmail.com");
    assertEquals(expectedEmail.getEmail(), john.getEmail().getEmail());
  }
}
