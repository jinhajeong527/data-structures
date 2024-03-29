import com.jjh.sorting.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[]{2,4,5,6,4,2,3};
        bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}