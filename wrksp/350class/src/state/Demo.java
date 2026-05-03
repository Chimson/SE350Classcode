package state;

public class Demo {
  public static void main(String[] args) {
    Player p = new Player();
    p.changeState(new DefaultPlayer());
    p.update();
    System.out.println(p);
    p.changeState(new OverpoweredPlayer());
    p.update();
    System.out.println(p);
  }
}
