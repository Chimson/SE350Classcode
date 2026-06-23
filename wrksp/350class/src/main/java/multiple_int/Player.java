package multiple_int;

public class Player {
  
  private int health = 100;
  public void hurt(int amount) {
    health -= amount;
  }

  @Override
  public String toString() {
    return "Player {health: " + health + "}";
  }
  
}
