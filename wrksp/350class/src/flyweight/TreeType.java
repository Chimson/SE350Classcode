package flyweight;

// shared intrinsic state 
// this is the flyweight object
public class TreeType implements ITreeType {
  private char symbol;

  TreeType(char symbol) {
    this.symbol = symbol;
  }

  @Override
  public Character render(int x, int y) {
    return symbol;
  }
}

