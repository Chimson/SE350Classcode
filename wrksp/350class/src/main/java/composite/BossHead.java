package composite;

// Leaf
public class BossHead implements IBossComponent {
  private int hp = 50;

  @Override
  public void update() {
    System.out.println("Boss arm health at " + hp);
  }

  // can add more IBossComponent methods for taking damage etc.

}

