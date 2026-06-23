package factorymethod;

abstract class IHealth {
  protected int health;
  abstract void reduce(int amnt);
}
