package strategy;
import java.util.Arrays;

// plays the role of client and context
public class Demo<T> {

  public void insertionSort(int[] arr) {
    // fill in with the algorithm
  }

  // may want different implementations of an algorithm or behavior
  // instead of choosing a sort each time, use the Strategy classes
  // Strategy class can eliminate this kind of switch based on type
  public void chooseSort(String sortname, int[] arr) {
    switch(sortname) {
      case "insertion":
        insertionSort(arr);
        break;
      case "java":
        Arrays.sort(arr);
        break;
    }
  }

  public static void intArraySort(int[] arr, ISortStrategy sortStrategy) {
    sortStrategy.sort(arr);
  }

  // can flip out with JavaSortStrategy
  private static ISortStrategy sortStrategy = new InsertionSortStrategy();

  public static void main(String[] args) {
    
    // avoid switch through Strategy Pattern
    int[] arr = new int[] {4, 3, 2, 1};
    intArraySort(arr, sortStrategy); 
    System.out.println(Arrays.toString(arr));
    
  }
  
}
