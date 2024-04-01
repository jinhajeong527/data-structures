import com.jjh.sorting.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr1 = new int[]{4,3,2,4,2,9,5,1,7};
        int[] arr2 = new int[]{};
        int[] arr3 = new int[]{1,2,2,0};
        quickSort.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}