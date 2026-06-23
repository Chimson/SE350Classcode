package templatemethod;

public class Dragon extends Enemy {
  @Override
  protected void windUp() {
    System.out.println("Dragon inhales deeply, flames building.");
  }

  @Override
  protected void executeAttack() {
    System.out.println("Dragon breathes a massive fireball!");
  }
}

