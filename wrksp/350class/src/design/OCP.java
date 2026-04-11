package design;

// should split the interfaces and classes up to their own files

// Open-Close Principle
// Open for extension and Closed for modification
//   extend without changing existing behavior
// Extend Health data management with more IHealthModifier classes 
//   without changing Health class
// Extend Player by having new ways of changing health

public class OCP {
  interface IHealthModifier {
    int apply(int current, int amount);
  }
  
  class AdditiveHealthModifier implements IHealthModifier {
    public int apply(int current, int amount) {
      return current + amount;
    }
  }
  
  class PercentageHealModifier implements IHealthModifier {
    public int apply(int current, int amount) {
      return current + (current * amount / 100);
    }
  }
  
  class Health {
    private int val = 100;

    public void modify(int amount, IHealthModifier modifier) {
      val = modifier.apply(val, amount);
    }

    public int get() {
      return val;
    }
  }
  
  class PlayerData {
    private final Health health = new Health();

    public void heal(int amount, IHealthModifier modifier) {
      health.modify(amount, modifier);
    }
    
    // can add a similar takeDamage(int, IHealthModifier) method

    public int getHealth() {
      return health.get();
    }
  }
}

