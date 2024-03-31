import com.jjh.sorting.BubbleSort;
import com.jjh.sorting.InsertionSort;
import com.jjh.sorting.MergeSort;
import com.jjh.sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr1 = new int[]{4,3,2,4,2,9,5,1,0};
        int[] arr2 = new int[]{};
        int[] arr3 = new int[]{1,2,2,0};
        mergeSort.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}