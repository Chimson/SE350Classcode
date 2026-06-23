package composite;

public class Demo {
    
  public static void main(String[] args) {
    BossComposite boss = new BossComposite();
    IBossComponent head = new BossHead();
    IBossComponent arm = new BossArm();

    // add the components
    boss.add(head);
    boss.add(arm);

    // collect parts and whole together
    IBossComponent[] all = new IBossComponent[] {boss, arm, head};

    // can treat the composite and components as all components
    for (IBossComponent part: all) {
      part.update();
    }




  }
  
}
