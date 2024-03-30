import com.jjh.sorting.BubbleSort;
import com.jjh.sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr1 = new int[]{4,2,2,6,4,3,2};
        int[] arr2 = new int[]{7,3};
        int[] arr3 = new int[]{7};
        int[] arr4 = new int[]{};
        selectionSort.sort(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}