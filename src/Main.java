import com.jjh.heaps.MinHeap;
import com.jjh.heaps.Node;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Node> list = Arrays.asList(
                new Node(17, "a"),
                new Node(15, "b"),
                new Node(13, "c"),
                new Node(12, "d"),
                new Node(11, "e"),
                new Node(9, "f")
        );

        MinHeap.heapify(list);
        System.out.println("Done");
    }
}