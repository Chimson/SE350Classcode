package observer;

public class LogSystem implements IObserver {
  private Player player;
  
  public LogSystem(Player player) {
    this.player = player;
  }
  
  public void update() {
    // maybe replace writing to an actual file
    System.out.println("... wrote player updates health to " + player.getHealth() + " to log file");
  }
}
