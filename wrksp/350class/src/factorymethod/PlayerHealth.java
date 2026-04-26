package factorymethod;

public class PlayerHealth {
  private int health;
  public PlayerHealth() {
    health = 100;
  }
  public void reduce(int amnt) {
    health -= amnt;
  }
  public String toString() {
    return "Health: " + health;
  }
}

