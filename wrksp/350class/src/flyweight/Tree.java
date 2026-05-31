package flyweight;

// contains extrinsic state that can vary based on the given shared flyweight
public class Tree {
  private final int x;
  private final int y;
  private final ITreeType type;

  public Tree(int x, int y, ITreeType type) {
    this.x = x;
    this.y = y;
    this.type = type;
  }

  Character render() {
    return type.render(x, y);
  }
}

