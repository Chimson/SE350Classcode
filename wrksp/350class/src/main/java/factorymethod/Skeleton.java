package factorymethod;

public class Skeleton implements IAttackableEnemy {
  private int atkPower;
  public Skeleton(int atk) {
    atkPower = atk;
  }
  public void attack(PlayerHealth p) {
    p.reduce(atkPower);
  }
}
