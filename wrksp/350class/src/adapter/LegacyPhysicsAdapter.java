package adapter;

// object adapter since it has a reference to adaptee
public class LegacyPhysicsAdapter implements IGamePhysics {
  private final LegacyPhysics legacy = new LegacyPhysics();

  @Override
  public void applyForce(IGameEntity e, float x, float y) {
    System.out.println("convert to legacy.push() ...");
    legacy.push(e, new float[]{x, y});
  }

}

