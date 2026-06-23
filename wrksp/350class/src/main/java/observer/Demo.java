package observer;

public class Demo {
  
  public static void main(String[] args) {
    Player p1 = new Player(100);
    p1.attach(new MessageSystem(p1));
    p1.attach(new LogSystem(p1));
    p1.heal(10);

  }

}
