package oopintro;

// mutatable with set method
class MutPos {
  private int x;
  private int y;
  public void set(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}


// TODO: make immutable, enforce with final
// methods that would normally mutate an object now create a new object
public class Position {
  
  private final int x;   
  private final int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Position move(int delx, int dely) {
    return new Position(x + delx, y + dely);
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  @Override
  // test equals across execution paths
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    }
    if (!this.getClass().equals(other.getClass())) {
      return false;
    }
    else if (this == other) {
      return true;
    }
    else {
      Position otherPos = (Position) other;
      return this.x == otherPos.x && this.y == otherPos.y;
    }
  }
  
  public static void main(String[] args) {
    Position p1 = new Position(1, 2);
    MutPos p2 = new MutPos();
    p2.set(0, 0);
    System.out.println("p1: " + p1);
    System.out.println("p2: " + p2);

    // mutating the same obj with MutPos
    MutPos p3 = p2;
    p2.set(1, 2);
    System.out.println(p2 == p3); // true

    // new object with Immutable
    Position p0 = p1.move(-1, -1);
    System.out.println(p0 == p1); // false  
  }
}

