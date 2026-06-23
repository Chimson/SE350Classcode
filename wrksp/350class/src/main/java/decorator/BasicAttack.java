package decorator;

// concrete component
public class BasicAttack implements IAttack {
  
  @Override
  public int damage() {
    return 10;
  }

}

