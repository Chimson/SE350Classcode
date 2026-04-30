package multiple_int;

public class MoveAndAttack {

  public static void main(String[] args) {
  
    IEnemyFactory skFactory = new SkeletonFactory();
    
    // generate members
    IEnemy e1 = skFactory.create();
    Player p = new Player();

    e1.attack(p);
    e1.move(10, 10);
    e1.attack(p);
    e1.move(-1, -1);

    System.out.println(p);
    System.out.println(e1);
    
  }

}
