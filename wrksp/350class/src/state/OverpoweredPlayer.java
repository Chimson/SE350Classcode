package state;

public class OverpoweredPlayer implements IPlayerAttackState {
  
  public void handle(Enemy e) {
    e.hurt(50);
  }

}
