import com.jjh.sorting.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = new int[] {30, 20, 40, 35, 5, 10, 45, 50, 25, 15};
        is.sortDescOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}