package decorator;

public abstract class AttackDecorator implements IAttack {
  protected IAttack inner;

  public AttackDecorator(IAttack inner) {
    this.inner = inner;
  }
}

