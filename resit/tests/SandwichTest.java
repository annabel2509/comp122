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


class SandwichTest {
  @Test
  public void testInstantiate() {
    Sandwich i = new Sandwich("desc", 1, 1, 200);
  }

  @Test
  public void testToString() {
    Sandwich s = new Sandwich("Tuna", 150, 200, 400);
    String expected = "[Tuna; price:150p weight:200g calories:400kcal]";
    assertEquals(expected, s.toString());
  }

  @Test
  public void getCalories() {
    Sandwich i = new Sandwich("desc", 1, 1,200);
    assertEquals(200, i.getCalories());
  }

}
