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
      Item d = new Item("Cola", 100, 400);
      list.add(d);
      Item o = new Item("OJ", 100, 300);
      list.add(o);
      Item s = new Item("BLT", 200, 200);
      list.add(s);
      Item g = new Item("Grapes", 50, 200);
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
  public void testAdd() {
    Basket b = new Basket();
    b.add(new Item("OJ", 100, 300));
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

  // test if defined
  @Test
  public void getPrice() {
    Basket b = new Basket();
    assertEquals(0, b.getPrice());
  }

  // test if it works with add
  @Test
  public void addAndGetPrice() {
    Basket b = createFullBasket();
    assertEquals(450, b.getPrice());
  }
  
  // test if defined
  @Test
  public void getWeight() {
    Basket b = new Basket();
    assertEquals(200, b.getWeight());
    b = createFullBasket();
    assertEquals(1300, b.getWeight());
  }
  
  // test if it works with add
  @Test
  public void addAndGetWeight() {
    Basket b = createFullBasket();
    assertEquals(1300, b.getWeight());
  }
}

