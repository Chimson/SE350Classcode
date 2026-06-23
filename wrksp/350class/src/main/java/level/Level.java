package level;
import java.util.Arrays;

// hides the constructor in Level;
// DLB fields are visible by any inherited class or class in the same package
// protected is visible in same package and subclasses
// package-private restricts visibility to the same package
//   restricts the Builder data and methods to only the package
//   need the Builder class public so that Level.constructWith() can be given a builder outside the package

public class Level {


  private char[][] map;
  private String title;
    
  // limit the use of the construct to only the builder
  private Level(char[][] map, String title) {
    this.map = map;
    this.title = title;
  }

  public static Level constructWith(ILevelBuilder builder) {
    builder.buildInitialGrid(25, 25);
    builder.buildTitle();
    builder.buildEntrance(new Position (0, 0));
    Level lvl = new Level(builder.map, builder.title);
    return lvl;
  }
  
  public String toString() {
    return "title: " + title + "\n" + 
      "map: " + Arrays.deepToString(map) + "\n";
  }

  public static void main(String[] args) {

  }


}
