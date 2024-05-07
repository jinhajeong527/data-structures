package com.jjh.heaps;

public class MinHeap {
    private Node[] nodes = new Node[10];
    private int size;

    private class Node {
        int key;
        String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void insert(int key, String value) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        Node node = new Node(key, value);
        nodes[size++] = node;
        bubbleUp();
    }

    public String remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node node = nodes[0];
        nodes[0] = nodes[--size];
        bubbleDown();
        return node.value;
    }

    public void bubbleUp() {
        int index = size - 1;
        while (index > 0 && nodes[parent(index)].key > nodes[index].key) {
            swap(parent(index), index);
            index = parent(index);
        }
    }

    public void bubbleDown() {
        int index = 0;
        while (index < size && !isValidParent(index)) {
            int smallerIndex = smallerChildIndex(index);
            swap(index, smallerIndex);
            index = smallerIndex;
        }
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    private boolean isValidParent(int index) {
        if (!hasLeftChild(index)) {
            return true;
        }
        boolean isValid = nodes[index].key < leftChild(index).key;

        if (hasRightChild(index)) {
            isValid &= nodes[index].key < rightChild(index).key;
        }

        return isValid;
    }

    private int smallerChildIndex(int index) {
        if (!hasLeftChild(index)) {
            return index;
        }
        if (!hasRightChild(index)) {
            return leftChildIndex(index);
        }
        return leftChild(index).key > rightChild(index).key ?
                rightChildIndex(index) : leftChildIndex(index);
    }

    private Node leftChild(int index) {
        return nodes[leftChildIndex(index)];
    }

    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private Node rightChild(int index) {
        return nodes[rightChildIndex(index)];
    }

    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    private boolean isFull() {
        return size == nodes.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void swap(int first, int second) {
        Node temp = nodes[first];
        nodes[first] = nodes[second];
        nodes[second] = temp;
    }

}
