package state;

public class Enemy {
  private int health;
  public Enemy() {
    health = 100;
  }
  public void hurt(int amnt) {
    health -= amnt;
  }
  
  public String toString() {
    return "Enemy {health: " + health + "}";
  } 
  
}
