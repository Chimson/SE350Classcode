package adapter;

public class Demo {
  public static void main(String[] args) {
  
    IGamePhysics phys = new LegacyPhysicsAdapter();
    phys.applyForce(new Player(), 10, -3);
  
  }
}
