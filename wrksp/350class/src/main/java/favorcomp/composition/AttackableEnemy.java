package favorcomp.composition;

  // composition can be better because you can add more specific enemies that mix and match behavior
  // can add FlyableSupportEnemy without fitting it into the inheritance tree
  // Delegation is employed: AttackableEnemy delgates attack to IAttackPlayer implementing classes


  // How to make this align with SOLID Principles:
  // Add Health class (SRP) that manages health, make Player and Enemy dependent on IHealth (OCP)
  // Delegate losing health to Health rather than player
  // Make them all dependent on "abstraction" except for the Health Data class
  // Make Enemy attack Player and Player attack enemy, both dependent on IHealth operations
  // Make data class Attack, make EnemyAttackComponent dependent on it (DIP), (OCP)


public class AttackableEnemy {
  private Enemy enemy;
  private IAttackPlayer attackComp;
  public AttackableEnemy(int health, int atkval) {
    this.enemy = new Enemy(health);
    this.attackComp = new EnemyAttackComponent(atkval);
  }
  public void attack(Player player) {
    attackComp.attack(player);  // delegates attack to IAttackPlayer       
  }
}
