package shapestests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import shapes.Rectangle;

class RectangleTest {
  
  @Test
  void area_returnsWidthTimesHeight() {
    Rectangle r = new Rectangle(0, 0, "blue",
      4, 5);
    assertEquals(20, r.area());
  }
  
  
}