package flyweight;

public class Demo {
  
  public static void main(String[] args) {
    
    // some Trees share a TreeType
    Tree t1 = new Tree(0, 1, TreeFactory.get('t'));
    Tree t2 = new Tree(0, 2, TreeFactory.get('T'));
    Tree t3 = new Tree(0, 0, TreeFactory.get('t'));

    System.out.println("t1: " + t1.render());
    System.out.println("t2: " + t2.render());
    System.out.println("t3: " + t3.render());

  }

}
