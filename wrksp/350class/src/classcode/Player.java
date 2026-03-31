package classcode;

public class Player implements Damageable {

  private String name;
  private int level;
  private int health;
  public Position pos;
  final public static int maxHealth = 100;
  

  public Player(String name, Position p) {
    this.name = name;
    level = 1;
    health = 100;
    pos = p;
  }

  @Override
  public void takeDamage(int amount) {
    health -= amount;
  }

  public void takeDamage(double percent) {
    health -= dmgByPercentHealth(percent);
  }

  private int dmgByPercentHealth(double percent) {
    return (int) (percent * health);
  }

  public void levelUp() {
    level += 1;
  }

  public static void reset(Player p) {
    p.name = "";
    p.level = 0;
    p.health = maxHealth;
  }

  public Position getPos(Position p) {
    return p;
  }

  @Override
  public String toString() {
    return "Player: (name: " + name + 
      ", level: " + level + ", health: " + health + ")"; 
  }

  public static void main(String[] args) {
    System.out.println("Max possible health: " + Player.maxHealth);
    Position p0 = new Position();
    p0.set(0, 0);
    
    
    Player pl1 = new Player("Ben", p0);
    pl1.takeDamage(0.50);
    System.out.println(pl1);
    pl1.levelUp();
    System.out.println(pl1);
    
    Player pl2 = new Player("Willie", p0);
    pl2.levelUp();
    System.out.println(pl2);

    Player.reset(pl1);
    System.out.println(pl1);

    pl1.takeDamage(10);

    // How do you set pl1 to a new Position?
    // How do you read it?
    
  }

}
