package classcodeTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oopintro.Position;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTests {
 
 private Position p0;
 private Position p1;
 private Position p2;
 
 @BeforeEach
 void initEqualAndNotEqual() {
   p0 = new Position(0, 0);
   p1 = new Position(1, 0);
   p2 = new Position(0, 0);
 } 
 
 @Test
 void equalsDiffPosObjSameVals() {
   assertTrue(p0.equals(p2));    
 }
 
 @Test
 void equalsDiffPosObjDiffVals () {
   assertEquals(false, p0.equals(p1));
 }
  
}
