package design;

// Fish class inherits behavior it doesn't need
// Entity operations need split up

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

    public void walkUp(int delY) { 
      setY(this.y + delY); 
    }
    public void swim(int delX, int delY) {
      setX(this.x + delX);
      setY(this.y + delY);
    }
  } 
  
  class Fish extends Entity {
    // inherit everything
  }
  
}
