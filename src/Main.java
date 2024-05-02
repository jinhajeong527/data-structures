import com.jjh.heaps.MaxHeap;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = { 5, 3, 8, 4, 1, 2 };
        MaxHeap.heapify(numbers1);
        System.out.println(MaxHeap.isMaxHeap(numbers1));
        int[] numbers2 = {};
        System.out.println(MaxHeap.isMaxHeap(numbers2));
        int[] numbers3 = { 5, 3};
        System.out.println(MaxHeap.isMaxHeap(numbers3));
    }
}