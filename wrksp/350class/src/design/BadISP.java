package design;

// Fish class inherits behavior it doesn't need
// EntityMoves operations need split up

public class BadISP {
   
  class Entity {
    private int x;
    private int y;
    public void setX(int x) {
      this.x = x;
    }
    public void setY(int y) {
      this.y = y;
    }
  }
  
  class EntityMoves {
    
    public static void walkUp(Entity e, int y) {
      e.setY(y);
    }
    public static void swim(Entity e, int x, int y) {
      e.setX(x);
      e.setY(y);
    }
  }
  
  class Fish extends EntityMoves {
    private Entity e;
    public Fish(Entity e) {
      this.e = e;
    }
  }
  
}