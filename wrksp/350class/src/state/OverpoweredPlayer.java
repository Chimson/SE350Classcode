package state;

public class OverpoweredPlayer implements IPlayerState {
  
  public void handle(Player p) {
    p.setHealth(150);
    p.setAttack(20);
  }

}
