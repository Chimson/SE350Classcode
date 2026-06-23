package design;

// should seperate all of the classes to their own file
// kept them together for demonstration only

// Single Responsibility Principle
// Health only has one responsibility - manage health value
//   Any changes to health system happens in Health 
// PlayerData has only one responsibility - manage the Players raw data

public class SRP {

  class Health {
    private int val;

    public Health() {
      val = 100;
    }

    public void modify(int amnt) {
      val += amnt; 
    }

    public int get() {
      return val;
    }
  }

  class PlayerData {
    private final Health health;

    public PlayerData() {
      this.health = new Health();
    }

    public void heal(int amount) {
      health.modify(amount);
    }

    public int getHealth() {
      return health.get();
    }
  }
}







