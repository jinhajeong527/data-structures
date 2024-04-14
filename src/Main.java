import com.jjh.graphs.Graph;


public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
//        graph.removeEdge("A", "/C");
        graph.removeEdge("A", "D");
//        graph.removeNode("B");
        graph.removeNode("A");
        graph.addEdge("B", "C");
        graph.print();


    }
}