package com.jjh.tries;

import java.util.HashMap;

public class Trie {
    // We can set this value from the outside before
    // creating the Trie object
    public static int ALPHABET_SIZE = 26;
    private class Node {
        private char value;
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "value=" + value;
        }

        public boolean hasChild(char ch) {
            return children.containsKey(ch);
        }

        public void addChild(char ch) {
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch) {
            return children.get(ch);
        }

        public Node[] getChildren() {
            return children.values().toArray(new Node[0]);
        }
    }
    private final Node root = new Node(' ');
    public void insert(String word) {
        Node current = root;
        for (var ch : word.toCharArray()) {
            if (!current.hasChild(ch)) {
                current.addChild(ch);
            }
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String word) {
        if (word == null) {
            return false;
        }

        Node current = root;

        for (char ch : word.toCharArray()) {
            if (!current.hasChild(ch)) {
                return false;
            }
            current = current.getChild(ch);
        }
        return current.isEndOfWord;
    }

    public void traverse() {
        traverse(root);
    }

    private void traverse(Node root) {
//        // Pre-order: visit the root first
//        System.out.println(root.value);

        for (Node child : root.getChildren()) {
            traverse(child);
        }

        // Post-order : visit the leaf node first
        System.out.println(root.value);
    }
}
