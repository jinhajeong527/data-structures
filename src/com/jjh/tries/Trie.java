package com.jjh.tries;

public class Trie {
    // We can set this value from the outside before
    // creating the Trie object
    public static int ALPHABET_SIZE = 26;
    private class Node {
        private char value;
        private Node[] children = new Node[ALPHABET_SIZE];
        private boolean isEndOfWord;

        public Node(char value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "value=" + value;
        }
    }
    private Node root = new Node(' ');
    public void insert(String word) {
        Node current = root;
        for (var ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node(ch);
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
}
