package multiple_int;

public class Skeleton implements IEnemy {
  private int x;
  private int y;
  private int attack = 10;

  @Override
  public void move(int delx, int dely) {
    x += delx;
    y += dely;
  }  
  
  @Override
  public void attack(Player p) {
    p.hurt(attack);
  }

  @Override
  public String toString() {
    return "Enemy {x:" + x + ", y:" + y + "}";
  }

}
