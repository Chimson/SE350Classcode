package generic;
import java.util.Arrays;

public class Default implements ISort {
  public void sort(Integer[] list) {
    Arrays.sort(list);
  }
}
