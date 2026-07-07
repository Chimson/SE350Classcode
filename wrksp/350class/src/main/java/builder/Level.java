package builder;

import java.util.Arrays;

public class Level {
  private char[][] map;
  private String title;

  public Level(char[][] map, String title) {
    this.map = map;
    this.title = title;
  }
  
  public String toString() {
    return "title: " + title + "\n" + 
      "map: " + Arrays.deepToString(map) + "\n";
  }

}
