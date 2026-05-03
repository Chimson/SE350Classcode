package state;

// Context

public class Player {

  private int health;
  private int attack;

  IPlayerState state = new OverpoweredPlayer();

  public void setHealth(int val) {
    this.health = val;
  }

  public void setAttack(int val) {
    this.attack = val;
  }
  
  public void changeState(IPlayerState newState) {
    state = newState;
  }

  public void update() {
    state.handle(this);
  }

  public String toString() {
    return "Player {health: " + health + ", attack: " + attack + "}";
  }

}
