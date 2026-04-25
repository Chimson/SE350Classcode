package design;
import java.util.Arrays;

// should split all of these classes into thier own files

public class BuilderPattern {

  class LevelBuilderDirector {
    private ILevelBuilder builder;
    
    public LevelBuilderDirector(ILevelBuilder builder) {
      this.builder = builder;
    }
    
    Level constuct() {
      builder.buildInitialGrid(25, 25);
      builder.buildTitle();
      builder.buildEntrance(new Position (0, 0));
      return builder.getLevel();
    }

  }

  class Level {
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

  // immutable
  class Position {
    private final int x;
    private final int y;
    
    public Position(int x, int y) {
      this.x = x; this.y = y;
    }
    
    public int getX() {
      return this.x;
    }
    
    public int getY() {
      return this.y;
    }
  }

  interface ILevelBuilder {
    public void buildInitialGrid(int width, int height);
    public void buildTitle();
    public void buildEntrance(Position p);
    public Level getLevel();
  }   

  class DefaultLevelBuilder implements ILevelBuilder {
    
    private char[][] map;
    private String title;

    public void buildInitialGrid(int width, int height) {
      map = new char[width][height];
      for (int i = 0; i < width; ++i) {
        for (int j = 0; j < height; ++j) {
          map[i][j] = '.';
        }
      }
    }

    public void buildTitle() {
      title = "Default Title";
    }

    public void buildEntrance(Position p) {
      map[p.getX()][p.getY()] = 'E';
    }

    public Level getLevel() {
      return new Level(map, title);
    }
  }

  public void demo() {
    LevelBuilderDirector lbd = new LevelBuilderDirector(new DefaultLevelBuilder());
    Level dlvl = lbd.constuct();
    System.out.println(dlvl);

  }
  
  public static void main(String[] args) {
    (new BuilderPattern()).demo();
  }

}
