package flyweight;

class Tree {
  private final int x;
  private final int y;
  private final TreeType type;

  Tree(int x, int y, TreeType type) {
    this.x = x;
    this.y = y;
    this.type = type;
  }

  void render() {
    type.render(x, y);
  }
}



