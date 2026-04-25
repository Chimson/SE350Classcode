package abstractfactory;

public class Grass implements IGrass {
  
  private char grassTile;
  
  public Grass(char t) {
    grassTile = t;
  }

  public char getGrassTile() {
    return grassTile;
  }
  
}
