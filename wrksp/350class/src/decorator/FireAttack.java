package decorator;

// concrete decorator
// AttackDecorator is also an IAttack
//   includes implementation of damage() from AttackDecorator
public class FireAttack extends AttackDecorator {
  
  public FireAttack(IAttack inner) {
    super(inner);
  }


}

