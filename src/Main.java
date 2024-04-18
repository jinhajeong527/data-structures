import com.jjh.graphs.Graph;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");
        graph.addEdge("X", "A");
        graph.addEdge("X", "B");
        graph.addEdge("A", "P");
        graph.addEdge("B", "P");
        List<String> list = graph.topologicalSort();
        System.out.println(list);
    }
}