package classcode;

public class Position {
  
  static class UnsafePos {
    public int x;
    public int y;
  }
  
  private int x;   
  private int y;
  
  public void set(int valx, int valy) {
    x = valx;
    y = valy;
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
    Position p1 = new Position();
    p1.set(0, 0);
    UnsafePos p2 = new UnsafePos();
    p2.x = 0;   
    p2.y = 0;
    System.out.println("p1: " + p1);
    System.out.println("p2: (" + p2.x + ", " + p2.y + ")");

    Position p3 = new Position();
    p3.set(0, 1);
    Position p4 = new Position();
    p4.set(0, 0);
    System.out.println(p3.equals(p3));  // true
    System.out.println(p1.equals(p4));  // true bc same coords
    System.out.println(p3.equals(p4));  // false bc diff coords
  }
}

