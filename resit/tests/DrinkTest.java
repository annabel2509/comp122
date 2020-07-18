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


class DrinkTest {
  @Test
  public void testInstantiate() {
    Drink i = new Drink("desc", 1, 1, 200);
  }

  @Test
  public void testToString() {
    Drink i = new Drink("Cola", 100, 400, 330);
    String expected = "[Cola; price:100p weight:400g volume:330ml]";
    assertEquals(expected, i.toString());
  }

  @Test
  public void getVolume() {
    Drink i = new Drink("desc", 1, 1,200);
    assertEquals(200, i.getVolume());
  }

}
