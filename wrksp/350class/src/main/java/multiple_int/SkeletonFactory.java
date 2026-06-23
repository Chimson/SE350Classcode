package multiple_int;

// factory method
public class SkeletonFactory implements IEnemyFactory {
  
  public IEnemy create() {
    return new Skeleton();
  }
  
}
