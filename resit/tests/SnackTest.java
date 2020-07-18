import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


import java.lang.reflect.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class SnackTest {
  @Test
  public void testInstantiate() {
    Snack i = new Snack("desc", 1, 1, true);
  }

  @Test
  public void testToString() {
    Snack c = new Snack("Crisps", 50, 20, false);
    String expected = "[Crisps; price:50p weight:20g healthy:No]";
    assertEquals(expected, c.toString());
  }

  @Test
  public void getHealthy() {
    Snack s = new Snack("desc", 1, 1, false);
    assertFalse(s.getHealthy());
    s = new Snack("desc", 1, 1, true);
    assertTrue(s.getHealthy());
  }

}
