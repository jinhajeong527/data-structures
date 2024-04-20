import com.jjh.graphs.WeightedGraph;

public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "C", 2);
        graph.addEdge("A", "D", 4);
//        graph.addEdge("C", "D", 4);
        System.out.println(graph.hasCycle());
    }
}