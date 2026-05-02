package strategy;
import java.util.Arrays;

// takes built in array sort from Java (possibly a variant on quicksort?)
public class JavaSortStrategy implements ISortStrategy {
    
  public void sort(int[] arr) {
    Arrays.sort(arr);
  }

}
