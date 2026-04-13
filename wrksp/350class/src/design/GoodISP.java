package design;

// ISP: Interface Segregation Principle
// Walk and Swim operations are no longer tied together in EntityMoves
// Done here by Java Interface but could also use classes for Walkable and Swimmable

class GoodISP {

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

  interface Walkable {
    void walkUp(int amount);
  }

  interface Swimmable {
    void swim(int x, int y);
  }

  class Fish extends Entity implements Swimmable {

    @Override
    public void swim(int x, int y) {
      setX(x);
      setY(y);
    }
  }
}


