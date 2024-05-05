package com.jjh.heaps;

import java.util.Collections;
import java.util.List;

public class MinHeap {

    private final Node[] heap = new Node[10];
    private int size;

    public void insert(int key, String value) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        heap[size++] = new Node(key, value);
        bubbleUp();
    }

    public String remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node root = heap[0];
        heap[0] = heap[--size];

        bubbleDown();
        return root.getValue();
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void bubbleUp() {
        // When insert() method called, size increased by one.
        // So size minus 1 is the last index of this array
        int index = size - 1;
        while (index > 0 && heap[parent(index)].getKey() > heap[index].getKey()) {
            swap(heap, parent(index), index);
            index = parent(index);
        }
    }

    private void bubbleDown() {
        int index = 0;
        while (index < size && !isValidParent(index)) {
            int smallerChild = smallerChildIndex(index);
            swap(heap, index, smallerChild);
            index = smallerChild;
        }
    }

    private boolean isValidParent(int index) {
        if (!hasLeftChild(index)) {
            return true;
        }
        boolean isValid = heap[index].getKey() <= heap[leftChild(index)].getKey();

        if (hasRightChild(index)) {
            isValid &= heap[index].getKey() <= heap[rightChild(index)].getKey();
        }
        return isValid;
    }

    private boolean hasLeftChild(int index) {
        return leftChild(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChild(index) < size;
    }

    private int smallerChildIndex(int index) {
        if (!hasLeftChild(index)) {
            return index;
        }

        if (!hasRightChild(index)) {
            return leftChild(index);
        }

        return heap[leftChild(index)].getKey() < heap[rightChild(index)].getKey() ?
                leftChild(index) : rightChild(index);

    }


    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
     }

    private void swap(Node[] heap, int first, int second) {
        Node temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }


    public static void heapify(List<Node> list) {
        int lastParentIndex = list.size() / 2 - 1;
        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(list, i);
        }
    }

    private static void heapify(List<Node> list, int index) {

        int smallerIndex = index;

        int left = index * 2 + 1;
        if (left < list.size() && list.get(smallerIndex).getKey() > list.get(left).getKey()) {
            smallerIndex = left;
        }

        int right = index * 2 + 2;
        if (right < list.size() && list.get(smallerIndex).getKey() > list.get(right).getKey()) {
            smallerIndex = right;
        }

        if (index == smallerIndex) {
            return;
        }
        Collections.swap(list, index, smallerIndex);
        heapify(list, smallerIndex);
    }
}
