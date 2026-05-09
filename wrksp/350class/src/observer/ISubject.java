package observer;

// could use an abstract class or even regular inheritance 
//   this would help each subject use the same data structure and implementation of these methods

interface ISubject {
  public void attach(IObserver observer);
  public void detach(IObserver observer);
  public void notifyObservers();
}
