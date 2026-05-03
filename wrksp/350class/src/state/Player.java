package state;


public class Player {

  private int attack;
  IPlayerAttackState state;

  public Player() {
    this.attack = 10;
  }
  
  public void changeState(IPlayerAttackState newState) {
    state = newState;
  }

  // Context
  public void attack(Enemy e) {
    if (state == null) {
      e.hurt(attack);
    }
    else {
      state.handle(e);
    }
  }

}
