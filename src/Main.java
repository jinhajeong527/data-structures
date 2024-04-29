import com.jjh.heaps.MaxHeap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 8, 4, 1, 2 };
        // heapify(array)
        MaxHeap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}