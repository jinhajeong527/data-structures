import com.jjh.heaps.Heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 10, 1, 4, 3};
        Heap heap = new Heap(numbers.length);
        for (int number: numbers) {
            heap.insert(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = heap.remove();
        }
        // Sorted Array with descending order
        System.out.println(Arrays.toString(numbers));
    }
}