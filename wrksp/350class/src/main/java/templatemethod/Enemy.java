package templatemethod;

public abstract class Enemy {
  // Template Method
  // algorithm steps for all Enemy types
  public final void performAttack() {
    selectTarget();
    windUp();
    executeAttack();
    applyDamage();
    recover();
  }

  protected void selectTarget() {
    System.out.println("Enemy selects the closest player.");
  }

  protected abstract void windUp();
  protected abstract void executeAttack();

  protected void applyDamage() {
    System.out.println("Damage applied to player.");
  }

  protected void recover() {
    System.out.println("Enemy returns to idle stance.");
  }
}

