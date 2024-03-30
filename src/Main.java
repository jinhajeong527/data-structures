import com.jjh.sorting.BubbleSort;
import com.jjh.sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = new int[]{4,2,2,6,4,3,2};
        selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}