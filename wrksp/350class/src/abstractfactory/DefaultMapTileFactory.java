
package abstractfactory;

public class DefaultMapTileFactory implements IMapTileFactory {
  
  public ITree createTree() {
    return new Tree('T'); 
  }

  public IGrass createGrass() {
    return new Grass('g');
  }
}
