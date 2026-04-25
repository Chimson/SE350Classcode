package level;

abstract class ILevelBuilder {
    
    protected char[][] map;
    protected String title;

    protected abstract void buildInitialGrid(int width, int height);

    protected abstract void buildTitle();

    protected abstract void buildEntrance(Position p);

  } 