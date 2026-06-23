package observer;

public class MessageSystem implements IObserver {
  private Player player;
  
  public MessageSystem(Player player) {
    this.player = player;
  }

  public void update() {
    System.out.println("Player is healed to " + player.getHealth());
  }

  
}  
