package com.jjh.avltrees;

public class AVLTree {
    private AVLNode root;
    private class AVLNode {
        private int height;
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value=" + this.value;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null) {
            return new AVLNode(value);
        }
        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);
        // On the way back up, reset the height of root node
        root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;
        return root;
    }

    private int height(AVLNode node) {
        // Height of an empty tree is negative 1
        return node == null ? -1 : node.height;
    }
}
