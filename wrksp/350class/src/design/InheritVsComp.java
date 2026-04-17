package design;


public class InheritVsComp {
  
  // example of poorly using inheritance that builds through subclass
  // composition below --- is much easier to maintain
  // What if you need Flyable enemy? 
  //   Is it Attackable? maybe not, maybe it only supports other enemies
  // Adding more specific behavior explodes the number of direct subclasses
  class Inherit {
    
    class Enemy {
      private int health;
      public Enemy(int health) {
        this.health = health;
      }
    }

    class AttackableEnemy extends Enemy {  
      private int attack;
      public AttackableEnemy(int health, int attack) {
        super(health);
        this.attack = attack;
      }   
      public void attackPlayer(Player player, int amnt) {
        player.health -= amnt;
      }
    }

    class Player {
      public int health;
    }
  
  }

  // ---
  
  // this is better because you can add more specific enemies that mix and match behavior
  // can add FlyableSupportEnemy without creating another subclass of Enemy
  // can easily add FlyableAttackableEnemy building on Attackable Enemy
  //   not forced into the inheritance tree somewhere
  class Composition {
  
    class Enemy {
      private int health;
      public Enemy(int health) {
        this.health = health;
      }
    }

    // simple for illustrative purposes
    class Player {
      public int health;
    }

    interface IAttackPlayer {
      public void attack(Player player);
    }

    class EnemyAttackComponent implements IAttackPlayer {
      private int attack;
      public EnemyAttackComponent(int attack) {
        this.attack = attack;
      }
      public void attack(Player player) {
        player.health -= attack;  
      }
    }

    class AttackableEnemy {
      private Enemy enemy;
      private IAttackPlayer attackComp;
      public AttackableEnemy(int health, int atkval) {
        this.enemy = new Enemy(health);
        this.attackComp = new EnemyAttackComponent(atkval);
      }
      public void attack(Player player) {
        attackComp.attack(player);
      }
    }

  
  }
  
  

}
