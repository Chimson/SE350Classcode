package builder;

public class Demo {

  public static void main(String[] args) {
    
    LevelBuilderDirector lbd = new LevelBuilderDirector(new DefaultLevelBuilder());
    Level dlvl = lbd.constuct();
    System.out.println(dlvl);
  }

}
