package builder;

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
