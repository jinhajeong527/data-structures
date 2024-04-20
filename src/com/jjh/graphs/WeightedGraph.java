package com.jjh.graphs;

import java.util.*;

public class WeightedGraph {
    private Map<String, Node> nodes = new HashMap<>();

    private class Node {
        private String label;
        private List<Edge> edges = new ArrayList<>();

        public Node(String label) {
            this.label = label;
        }

        public void addEdge(Node to, int weight) {
            edges.add(new Edge(this, to, weight));
        }

        public List<Edge> getEdges() {
            return edges;
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
        nodes.putIfAbsent(label, new Node(label));
    }

    public void addEdge(String from, String to, int weight) {
        Node fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();

        Node toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException();

        fromNode.addEdge(toNode, weight);
        toNode.addEdge(fromNode, weight);
    }
    public void print() {
        for (Node node : nodes.values()) {
            List<Edge> edges = node.getEdges();
            if (!edges.isEmpty()) {
                System.out.println(node + " is connected to " + edges);
            }
        }
    }

    private class NodeEntry {
        private Node node;
        private int priority;

        public NodeEntry(Node node, int priority) {
            this.node = node;
            this.priority = priority;
        }
    }


    public Path getShortestDistance(String from, String to) {
        Node fromNode = nodes.get(from);
        if (fromNode == null) {
            throw new IllegalArgumentException();
        }
        Node toNode = nodes.get(to);
        if (toNode == null) {
            throw new IllegalArgumentException();
        }

        Map<Node, Integer> distances = new HashMap<>();
        for (Node node: nodes.values()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        // Replace distance of starting Node from Integer.MAX_VALUE to 0
        distances.replace(fromNode, 0);

        Map<Node, Node> previousNodes = new HashMap<>();
        Set<Node> visited = new HashSet<>();

        PriorityQueue<NodeEntry> queue = new PriorityQueue<>(
                Comparator.comparingInt(ne -> ne.priority));
        queue.add(new NodeEntry(fromNode, 0));

        while (!queue.isEmpty()) {
            Node current = queue.remove().node;
            visited.add(current);

            for (Edge edge: current.getEdges()) {
                if (visited.contains(edge.to))
                    continue;
                int distance = distances.get(edge.to);
                int newDistance = distances.get(current) + edge.weight;
                if (distance > newDistance) {
                    distances.replace(edge.to, newDistance);
                    previousNodes.put(edge.to, current);
                    queue.add(new NodeEntry(edge.to, newDistance));
                }
            }
        }

        return buildPath(previousNodes, toNode);
    }

    public boolean hasCycle() {
        Set<Node> visited = new HashSet<>();
        for (Node node: nodes.values()) {
            if (!visited.contains(node) &&
                    hasCycle(node, null, visited))
                return true;
        }
        return false;
    }

    private boolean hasCycle(Node current, Node parent,
                             Set<Node> visited) {
        visited.add(current);
        for (Edge edge: current.getEdges()) {
            if (edge.to == parent)
                continue;

            if (visited.contains(edge.to) || hasCycle(edge.to, current, visited))
                return true;
        }
        return false;
    }

    private Path buildPath(
            Map<Node, Node> previousNodes, Node toNode) {
        // We can build a shortest path using a Stack
        Stack<Node> stack = new Stack<>();
        stack.push(toNode);
        Node prev = previousNodes.get(toNode);
        while (prev != null) {
            stack.push(prev);
            prev = previousNodes.get(prev);
        }

        Path path = new Path();
        while (!stack.isEmpty()) {
            path.add(stack.pop().label);
        }
        return path;
    }

}
