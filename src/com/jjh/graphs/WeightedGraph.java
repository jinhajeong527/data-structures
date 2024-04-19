package com.jjh.graphs;

import java.util.*;

public class WeightedGraph {
    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Edge>> adjacencyList = new HashMap<>();

    private class Node {
        String label;
        List<Edge> edges;

        public Node(String label) {
            this.label = label;
        }

        public Node(String label, List<Edge> edges) {
            this.label = label;
            this.edges = edges;
        }

        @Override
        public String toString() {
            return label;
        }
    }
    private class Edge {
        private Node from;
        private Node to;
        private int weight;

        public Edge(Node from, Node to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return from + "->" + to;
        }
    }

    public void addNode(String label) {
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to, int weight) {
        Node fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();

        Node toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException();

        adjacencyList.get(fromNode).add(
                new Edge(fromNode, toNode, weight));
        adjacencyList.get(toNode).add(
                new Edge(toNode, fromNode, weight));
    }
    public void print() {
        for (Node source : adjacencyList.keySet()) {
            List<Edge> target = adjacencyList.get(source);
            if (!target.isEmpty()) {
                System.out.println(source + " is connected to " + target);
            }
        }
    }
}
