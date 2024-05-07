import com.jjh.heaps.MinHeap;

public class Main {
    public static void main(String[] args) {
        MinHeap mh = new MinHeap();
        mh.insert(7, "a");
        mh.insert(5, "b");
        mh.insert(3, "c");
        mh.insert(1, "d");
        mh.remove();
        System.out.println("Done");
    }
}