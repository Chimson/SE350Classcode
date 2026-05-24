package templatemethod;

public class Orc extends Enemy {
  @Override
  protected void windUp() {
    System.out.println("Orc raises its axe with a heavy grunt.");
  }

  @Override
  protected void executeAttack() {
    System.out.println("Orc swings the axe in a wide arc!");
  }
}

