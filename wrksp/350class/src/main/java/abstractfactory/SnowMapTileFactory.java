package abstractfactory;

public class SnowMapTileFactory implements IMapTileFactory {
  
  public ITree createTree() {
    return new Tree('S'); 
  }

  public IGrass createGrass() {
    return new Grass('s');
  }

}
