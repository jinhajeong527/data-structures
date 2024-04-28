package com.jjh.heaps;

public class Heap {
    private final int[] heap;
    private int currentIndex = 0;

    public Heap(int size) {
        this.heap = new int[size];
    }

    public void insert(int num) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        heap[currentIndex++] = num;
        bubbleUp();
    }

    public void remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        heap[0] = heap[--currentIndex];
        // Reset the last element
        heap[currentIndex] = 0;
        bubbleDown();
    }

    private void bubbleUp() {
        int index = currentIndex - 1;
        while (index > 0 && heap[parent(index)] < heap[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void bubbleDown() {
        int index = 0;
        while(index <= currentIndex && !isValidParent(index)) {
            int largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    private int largerChildIndex(int index) {
        return leftChild(index) > rightChild(index) ?
                leftChildIndex(index) : rightChildIndex(index);
    }

    private boolean isValidParent(int index) {
        return heap[index] >= leftChild(index) &&
                heap[index] >= rightChild(index);
    }

    public boolean isFull() {
        return currentIndex == heap.length;
    }

    public boolean isEmpty() {
        return currentIndex == 0;
    }

    private void swap(int first, int second) {
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return heap[leftChildIndex(index)];
    }

    private int rightChild(int index) {
        return heap[rightChildIndex(index)];
    }

    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }
}
