import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Email class.
 */

public class EmailTest {
  private Email email;

  @Before
  public void setUp() {
    email = new Email("Doe", "gmail.com");
  }

  @Test
  public void testEmail() {
    String expected = "Doe@gmail.com";
    assertEquals(expected, email.getEmail());
  }
}
