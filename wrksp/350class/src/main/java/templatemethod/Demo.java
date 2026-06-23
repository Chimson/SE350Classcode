package templatemethod;

/*
interface IPerformAttack {
  default void template() {
    commonCode();
    varyingCode();
  }
  default void commonCode() {
    this.data?
  }
  void varyingCode();
}
*/

public class Demo {
  
  public static void main(String[] args) {
    Enemy e1 = new Orc();
    Enemy e2 = new Dragon();
    e1.performAttack();
    e2.performAttack();
  }

}
