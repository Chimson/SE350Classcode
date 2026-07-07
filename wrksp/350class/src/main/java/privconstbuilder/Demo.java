package privconstbuilder;

public class Demo {

  public static void main(String[] args) {
  
    // Level is forced to use builder by making constructor private
    Level deflvl = Level.constructWith(new DefaultLevelBuilder());
    System.out.println(deflvl);
  }

}
