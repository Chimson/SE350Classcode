package abstractfactory;

public class Tree implements ITree {
  
  private char treeTile;

  public Tree(char t) {
    treeTile = t;
  }

  public char getTreeTile() {
    return treeTile;
  }

}
