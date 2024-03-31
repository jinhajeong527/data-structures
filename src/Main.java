import com.jjh.sorting.BubbleSort;
import com.jjh.sorting.InsertionSort;
import com.jjh.sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr1 = new int[]{4,3,2,1,0};
        int[] arr2 = new int[]{};
        int[] arr3 = new int[]{1,2,0};
        insertionSort.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }
}