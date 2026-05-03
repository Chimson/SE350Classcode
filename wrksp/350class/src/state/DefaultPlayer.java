package state;

public class DefaultPlayer implements IPlayerState {
  public void handle(Player p) {
    p.setHealth(100);
    p.setAttack(10);
  }
}
