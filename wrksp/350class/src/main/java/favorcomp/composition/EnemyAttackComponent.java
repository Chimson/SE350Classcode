package favorcomp.composition;

public class EnemyAttackComponent implements IAttackPlayer {
  private int attack;
  public EnemyAttackComponent(int attack) {
    this.attack = attack;
  }
  public void attack(Player player) {
    player.hurt(attack); 
  }
}
