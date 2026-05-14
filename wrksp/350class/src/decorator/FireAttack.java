package decorator;

// concrete decorator
// AttackDecorator is also an IAttack
public class FireAttack extends AttackDecorator {
  
  public FireAttack(IAttack inner) {
    super(inner);
  }

  @Override
  public int damage() {
    return inner.damage() + 5;
  }

}

