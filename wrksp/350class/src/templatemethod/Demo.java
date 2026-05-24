package templatemethod;

public class Demo {
  
  public static void main(String[] args) {
    Enemy e1 = new Orc();
    Enemy e2 = new Dragon();
    e1.performAttack();
    e2.performAttack();
  }

}
