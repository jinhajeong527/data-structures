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
    public void removeNode(String label) {
        Node node = nodes.get(label);
        if (node == null)
            return;

        for (Node key: adjacencyList.keySet()) {
            adjacencyList.get(key).remove(node);
        }

        adjacencyList.remove(node);
        nodes.remove(label);

    }

    public void removeEdge(String from, String to) {
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if (fromNode == null)
            return;
        if (toNode == null)
            return;
        adjacencyList.get(fromNode).remove(toNode);
    }

    public void traverseDepthFirst(String label) {
        Node node = nodes.get(label);
        if (node == null)
            return;

        traverseDepthFirst(nodes.get(label), new HashSet<>());
    }

    public void traverseDepthFirstIterative(String label) {
        Node node = nodes.get(label);
        if (node == null)
            return;

        Set<Node> visited = new HashSet<>();

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (visited.contains(current))
                continue;
            System.out.println(current);
            visited.add(current);

            for (Node neighbour: adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    stack.push(neighbour);
                }
            }
        }
    }


    private void traverseDepthFirst(Node node, Set<Node> visited) {
        System.out.println(node);
        visited.add(node);

        for (Node ad: adjacencyList.get(node)) {
            if (!visited.contains(ad)) {
                traverseDepthFirst(ad, visited);
            }
        }

    }

    public void traverseBreadthFirst(String label) {
        Node node = nodes.get(label);
        if (node == null)
            return;
        // To keep the track of visited nodes
        Set<Node> visited = new HashSet<>();

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (visited.contains(current))
                continue;
            System.out.println(current);
            visited.add(current);

            for (Node neighbors: adjacencyList.get(current)) {
                if (!visited.contains(neighbors)) {
                    queue.add(neighbors);
                }
            }
        }
    }

    public List<String> topologicalSort() {
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();

        for (Node node: nodes.values())
            topologicalSort(node, visited, stack);

        List<String> sorted = new ArrayList<>();
        while (!stack.isEmpty())
            sorted.add(stack.pop().label);

        return sorted;
    }

    private void topologicalSort(
            Node node, Set<Node> visited, Stack<Node> stack) {
        if (visited.contains(node)) {
            return;
        }
        visited.add(node);

        for (Node neighbor : adjacencyList.get(node)) {
            topologicalSort(neighbor, visited, stack);
        }
        stack.push(node);
    }

    public boolean hasCycle() {
        Set<Node> all = new HashSet<>();
        all.addAll(nodes.values());

        Set<Node> visiting = new HashSet<>();
        Set<Node> visited = new HashSet<>();

        while (!all.isEmpty()) {
//            Node current = all.toArray(new Node[0])[0];
            Node current = all.iterator().next();
            if (hasCycle(current, all, visiting, visited)) {
                return true;
            }
        }
        return false;
    }
    private boolean hasCycle(Node node, Set<Node> all,
                             Set<Node> visiting, Set<Node> visited) {
        all.remove(node);
        visiting.add(node);
        for (Node neighbour : adjacencyList.get(node)) {
            if (visited.contains(neighbour)) {
                continue;
            }
            // If you have this node in the visiting Set,
            // it means that there is a cycle in our graph
            if (visiting.contains(neighbour))
                return true;

            if (hasCycle(neighbour, all, visiting, visited))
                return true;
        }
        visiting.remove(node);
        visited.add(node);
        return false;
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
