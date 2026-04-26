package factorymethod;

public class SkeletonSpawner implements IEnemySpawner {
  public IAttackableEnemy spawnEnemy() {
    return new Skeleton(10);
  }
}

