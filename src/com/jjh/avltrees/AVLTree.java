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
        root.height = Math.max(
                height(root.leftChild),
                height(root.rightChild)) + 1;

        balance(root);

        return root;
    }

    private void balance(AVLNode root) {
        // > 1 => left heavy
        if (isLeftHeavy(root)) {
            System.out.println(root.value + " is left heavy");
            if (balanceFactor(root.leftChild) < 0)
                System.out.println("Left Rotate "  + root.leftChild.value);
            System.out.println("Right Rotate "  + root.value);
        }
        // < -1 => right heavy
        else if  (isRightHeavy(root)) {
            System.out.println(root.value + " is right heavy");
            if (balanceFactor(root.rightChild) > 0)
                System.out.println("Right Rotate " + root.rightChild.value);
            System.out.println("Left Rotate " + root.value);
        }

    }
    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private int height(AVLNode node) {
        // Height of an empty tree is negative 1
        return node == null ? -1 : node.height;
    }
}
