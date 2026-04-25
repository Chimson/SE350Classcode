package abstractfactory;

public class Demo {
  
  public static void main(String[] args) {

    // concrete factories only need to appear once
    //   on instantiation
    SnowMapTileFactory snowFact = new SnowMapTileFactory();
    ITree t1 = snowFact.createTree();
    IGrass g1 = snowFact.createGrass();
  

    DefaultMapTileFactory defFact = new DefaultMapTileFactory();
    ITree t2 = defFact.createTree();
    IGrass g2 = defFact.createGrass();

    // code that uses ITree interfaces and IGrass interfaces
    
    // code to process Snow tiles regardless of individual tile 
    //   or
    // code to process Default tiles regargless of individual tile
    

    

  }

}

