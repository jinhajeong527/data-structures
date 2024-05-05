import com.jjh.heaps.MinHeap;

public class Main {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(10, "a");
//        minHeap.insert(9, "b");
//        minHeap.insert(8, "c");
//        minHeap.insert(6, "d");
//        minHeap.insert(3, "e");
        String value = minHeap.remove();
//        String value2 = minHeap.remove();
//        String value3 = minHeap.remove();
//        String value4 = minHeap.remove();
//        String value5 = minHeap.remove();
        System.out.println(value);
//        System.out.println(value2);
//        System.out.println(value3);
//        System.out.println(value4);
//        System.out.println(value5);
    }
}