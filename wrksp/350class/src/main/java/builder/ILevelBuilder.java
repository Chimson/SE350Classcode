package builder;

interface ILevelBuilder {
  void buildInitialGrid(int width, int height);
  void buildTitle();
  void buildEntrance(Position p);
  Level getLevel();
}   
