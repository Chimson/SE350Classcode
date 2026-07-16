package builder;

public class LevelBuilderDirector {
  private ILevelBuilder builder;
  
  public LevelBuilderDirector(ILevelBuilder builder) {
    this.builder = builder;
  }
  
  public void setBuilder(ILevelBuilder builder) {
    this.builder = builder;
  }

  public Level constuct() {
    builder.buildInitialGrid(25, 25);
    builder.buildTitle();
    builder.buildEntrance(new Position (0, 0));
    return builder.getLevel();
  }

}
