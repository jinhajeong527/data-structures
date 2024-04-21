import com.jjh.graphs.WeightedGraph;

public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A", "B", 4);
        graph.addEdge("A", "C", 2);
        graph.addEdge("A", "D", 6);
        graph.addEdge("B", "C", 7);
        graph.addEdge("B", "D", 5);
        graph.addEdge("C", "D", 5);
        WeightedGraph tree = graph.getMinimumSpanningTree();
        tree.print();

    }
}