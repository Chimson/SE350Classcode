package factorymethod;

public class Demo {

  public static void main(String[] args) {
    
    PlayerHealth p1 = new PlayerHealth();


    // only need concrete spawner once on instantiation
    // (think IAttackableEnemySpawner)
    IEnemySpawner sp1 = new SkeletonSpawner();
    // other spawner

    // call all IEnemySpawner's spawnEnemy()
    IAttackableEnemy e1 = sp1.spawnEnemy();
    
    // have all enemies attack player, regardless of IAttackableEnemy type
    e1.attack(p1);
    
    System.out.println(p1);
  }

}
