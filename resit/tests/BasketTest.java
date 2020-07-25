import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.lang.reflect.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;


class BasketTest {
  
  private static List<Item> createItemList(){
      List<Item> list = new ArrayList<Item>();
      Drink d = new Drink("Cola", 100, 400, 330);
      list.add(d);
      Drink o = new Drink("OJ", 100, 300, 200);
      list.add(o);
      Sandwich s = new Sandwich("BLT", 200, 200, 450);
      list.add(s);
      Snack g = new Snack("Grapes", 50, 200, true);
      list.add(g);

      return list;
  }
  
  private Basket createFullBasket(){
      Basket b = new Basket();
      for (Item i : createItemList()) {
          b.add(i);
      }
      return b;
  }

  @Test
  public void testInstantiate() {
    Basket i = new Basket();
  }

  @Test
  public void testToString() {
    Basket b = new Basket();
    b.add(new Drink("OJ", 100, 300, 200));
    b.add(new Snack("Grapes", 50, 200, true));
    String expected = "---\n"
        + "[OJ; price:100p weight:300g volume:200ml]\n"
        + "[Grapes; price:50p weight:200g healthy:Yes]\n"
        + "---\n"
        + "Total weight: 700g\n"
        + "Total price: 150p";
    assertEquals(expected, b.toString());
  }

  @Test
  public void addAndGetPrice() {
    Basket b = new Basket();
    assertEquals(0, b.getPrice());
    b = createFullBasket();
    assertEquals(450, b.getPrice());
  }
  
  @Test
  public void addAndGetWeight() {
    Basket b = new Basket();
    assertEquals(200, b.getWeight());
    b = createFullBasket();
    assertEquals(1300, b.getWeight());
  }
}

