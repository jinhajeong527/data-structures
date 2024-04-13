package com.jjh.graphs;

import java.util.*;

public class Graph {
    private Map<String, Node> nodes = new HashMap();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();


    private class Node {
        private String label;
        public Node(String label) {
            this.label = label;
        }
        @Override
        public String toString() {
            return label;
        }
    }

    public void addNode(String label) {
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        // To prevent additional Null checking to addEdge method
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        Node fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();
        Node toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException();
        adjacencyList.get(fromNode).add(toNode);
    }

    public void print() {
        for (Node source : adjacencyList.keySet()) {
            List<Node> target = adjacencyList.get(source);
            if (!target.isEmpty()) {
                System.out.println(source + " is connected to " + target);
            }
        }
    }
}
