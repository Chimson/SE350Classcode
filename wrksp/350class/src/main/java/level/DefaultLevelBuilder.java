package level;

public class DefaultLevelBuilder extends ILevelBuilder {
  
  @Override
  protected void buildInitialGrid(int width, int height) {
    map = new char[width][height];
    for (int i = 0; i < width; ++i) {
      for (int j = 0; j < height; ++j) {
        map[i][j] = '.';
      }
    }
  }

  @Override
  protected void buildTitle() {
    title = "Default Title";
  }

  @Override
  protected void buildEntrance(Position p) {
    map[p.getX()][p.getY()] = 'E';
  }
}

