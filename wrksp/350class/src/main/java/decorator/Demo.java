package decorator;

public class Demo {
  
  public static void main(String[] args) {
    IAttack attack1 = 
      new FireAttack(new BasicAttack());

    System.out.println(attack1.damage());

  }

}
