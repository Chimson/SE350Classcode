package generic;

// static dispatch
public class Sort<T extends ISort> {
  private T obj;
  public void sort(Integer[] list) {
    obj.sort(list);
  }  
  public Sort(T obj) {
    this.obj = obj;
  }

}
