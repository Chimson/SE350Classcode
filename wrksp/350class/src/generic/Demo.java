package generic;
import java.util.Arrays;

public class Demo {


  public static void main(String[] args) {

    Sort<Default> defSort = new Sort<>(new Default());
    Integer[] arr = new Integer[] {5, 4, 3, 2, 1 }; 
    defSort.sort(arr);
    System.out.println(Arrays.toString(arr));
  }

}
