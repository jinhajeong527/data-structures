package com.jjh.binarytree;

public class Tree {
    // Node
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }
    // Tree (root)
    private Node root;
    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;
        while (true) {
            if (value < current.value) {
                // This means we found the parent of the node we try to insert
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }
    public boolean find(int value) {
        Node current = root;

        while (current != null) {
            if (value < current.value) {
                current  = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                // we found the target node
                return true;
            }
        }
        return false;
    }

    // Since Node is a private class, we made method with no parameter as public
    public void traversePreOrder() {
        traversePreOrder(root);
    }
    // Preorder: Root - Left - Right
    private void traversePreOrder(Node root) {
        // Base condition
        if (root == null)
            return;
        // root (print)
        System.out.println(root.value);
        // left
        traversePreOrder(root.leftChild);
        // right
        traversePreOrder(root.rightChild);
    }
    public void traverseInOrder() {
        traverseInOrder(root);
    }
    // Inorder: Left - Root - Right
    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }
    public void traversePostOrder() {
        traversePostOrder(root);
    }
    // Postorder: Left - Right - Root
    // Visit all the leaves first before going up in the tree.
    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }
    public int height() {
        return height(root);
    }
    private int height(Node root) {
        if (root == null)
            return -1;
        // base condition
        if (isLeaf(root)) {
            return 0;
        }
        return 1 + Math.max(height(root.leftChild),
                            height(root.rightChild));
    }
    public int min() {
        return min(root);
    }
    public int min_binarySearchTree() {
        return min_binarySearchTree(root);
    }
    // O(log n)
    private int min_binarySearchTree(Node root) {
        if (root == null) {
            throw new IllegalArgumentException();
        }
        Node current = root;
        Node last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }
    // O(n)
    private int min(Node root) {
        if (root == null) {
            throw new IllegalArgumentException();
        }
        if (isLeaf(root))
            return root.value;

        int left = min(root.leftChild);
        int right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    private boolean isLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }
}
