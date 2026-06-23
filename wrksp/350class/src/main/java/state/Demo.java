package state;

public class Demo {
  public static void main(String[] args) {
    Player p = new Player();
    Enemy e1 = new Enemy();
    p.attack(e1);
    System.out.println(e1);
    p.changeState(new OverpoweredPlayer());
    p.attack(e1);
    System.out.println(e1);
  }
}
