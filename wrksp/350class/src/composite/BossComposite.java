package composite;
import java.util.ArrayList;
import java.util.List;

public class BossComposite implements IBossComponent {
  private List<IBossComponent> parts = new ArrayList<>();

  public void add(IBossComponent part) {
    parts.add(part);
  }

  @Override
  public void update() {
    System.out.println("updating the whole boss ... ");
    for (IBossComponent part : parts) {
      part.update();
    }
  }
}


