package design;

// High and low level modules depend on abstactions (to a point)
// interfaces do not depend on concrete classes (to a point)
// At some point abstraction stops at a concrete class with primitive data


public class DIP {
  
  
  interface IAmount {
    void modify(int val); 
    int get();
  }
  
  interface IHealth {
    void change(IAmount amnt);
  }
  
  
  static class NonNegAmount implements IAmount {
    private int val;
    public NonNegAmount(int val) {
      this.val = Math.abs(val);
    }
    public void modify(int nval) {
      this.val += Math.abs(nval);
    }
    public int get() {
      return this.val;
    }
  }
  
  static class Health implements IHealth {
    private IAmount amnt;
    public Health(IAmount val) {
      amnt = val;
    }
    public void change(IAmount newAmnt) {
      amnt.modify(newAmnt.get());
    }
  }
  
  static class Player {
    IHealth health;
    public Player(IHealth health) {
      this.health = health;
    }
    // how do you add a heal method?
  }


}
