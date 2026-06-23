package diamond;

public class Demo {

  public static void main(String[] args) {
    IInputDevice id = new PlayerController();
    System.out.println(id.readInput());
  }

}
