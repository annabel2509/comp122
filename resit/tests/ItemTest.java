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


class ItemTest {
  
  @Test
  public void testInstantiate() {
    Item i = new Item("desc", 1, 1);
  }

  @Test
  public void testToString() {
    Item i = new Item("desc", 1, 1);
    String expected = "[desc; price:1p weight:1g]";
    assertEquals(expected, i.toString());
  }

  @Test
  public void getDescription() {
    Item i = new Item("desc", 1, 1);
    assertEquals("desc", i.getDescription());
  }

  @Test
  public void getPrice() {
    Item i = new Item("desc", 1, 1);
    assertEquals(1, i.getPrice());
  }

  @Test
  public void pricePerUnitWeight() {
    Item i = new Item("desc", 1, 2);
    assertEquals(1 / 2, i.pricePerUnitWeight());
  }
}
