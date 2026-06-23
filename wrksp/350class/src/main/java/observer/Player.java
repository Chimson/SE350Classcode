package observer;
import java.util.ArrayList;

public class Player implements ISubject {
  private int health;
  private ArrayList<IObserver> observers;

  public Player(int health) {
    this.observers = new ArrayList<IObserver>();
    this.health = health;
    
  }

  public int getHealth() {
    return health;
  }
  
  // notify on change;
  public void heal(int amnt) {
    health += amnt;
    notifyObservers();
  }

  @Override
  public void attach(IObserver observer) {
    observers.add(observer);
  }

  @Override 
  public void detach(IObserver observer) {
    observers.remove(observer);
  }
  
  @Override
  public void notifyObservers() {
    for (IObserver observer: observers) {
      observer.update();
    }
  }

  

}
