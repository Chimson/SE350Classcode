package composite;

// Leaf
public class BossArm implements IBossComponent {
  private int hp = 20;

  @Override
  public void update() {
    System.out.println("Boss arm health at " + hp);
  }

  // can add more IBossComponent methods for taking damage etc.

}

