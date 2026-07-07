package favorcomp.inherit;

  // example of using inheritance that builds through subclass
  // composition below --- is much easier to maintain
  // What if you need Flyable enemy? 
  //   Is it Attackable? maybe not, maybe it only supports other enemies
  // Can force relationships into inheritance tree
  //   May not be able to fully predict the tree design from the start
  //   Redesign on a class cascades changes down the subtree 

public class AttackableEnemy extends Enemy {  
  private int attack;
  public AttackableEnemy(int health, int attack) {
    super(health);
    this.attack = attack;
  }   
  public void attackPlayer(Player player, int amnt) {
    player.health -= amnt;
  }
}
