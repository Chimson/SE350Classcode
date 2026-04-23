package design;

// ISP: Interface Segregation Principle
// Walk and Swim operations are no longer tied together in Entity
// Done here by Java Interface but could also use classes for Walkable and Swimmable

// This works well on ISP, but how to refactor for the other SOLID Principles?
// Make entity an EntityPosition class (SRP), Entity an abstract class or composed of EntityPosition
//   Make Fish dependent on abstract class (DIP), possibly override setX setY
// Implement a Person class with WalkUp a Walkable interface to show more ISP

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

  interface WalkUp {
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


