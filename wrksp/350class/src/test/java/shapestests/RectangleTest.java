package shapestests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import shapes.Rectangle;

class RectangleTest {
  
  private Rectangle square; 
  
  @BeforeEach
  void testRectangles() {
    square = new Rectangle(0, 0, "red", 4, 4);
  }
  
  @Test
  void areaReturnsWidthTimesHeight() {
    Rectangle r = new Rectangle(0, 0, "blue",
      4, 5);
    assertEquals(20, r.area());  // can also add message on fail
  }
  
  @Test 
  void rectIsSquare() {
    assertTrue(square.isSquare());
  } 
  
  
  
  
}