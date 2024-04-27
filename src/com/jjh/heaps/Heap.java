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

    private void bubbleUp() {
        int index = currentIndex - 1;
        while (index > 0 && heap[parent(index)] < heap[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public boolean isFull() {
        return currentIndex == heap.length;
    }

    private void swap(int first, int second) {
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

//    public void remove() {
//        if (currentIndex == 0) {
//            System.out.println("Nothing to delete in this heap");
//            return;
//        }
//
//        int lastInserted = currentIndex - 1;
//        int root = 0;
//        int left = 1;
//        int right = 2;
//        heap[root] = heap[lastInserted];
//        while (left <= lastInserted) {
//            if (right <= lastInserted && (heap[left] > heap[right])) {
//               int temp = heap[left];
//               heap[left] = heap[root];
//               heap[root] = temp;
//               root = left;
//            } else if (right <= lastInserted && (heap[left] <= heap[right])) {
//                int temp = heap[right];
//                heap[right] = heap[root];
//                heap[root] = temp;
//                root = right;
//            } else if (right > lastInserted) {
//                int temp = heap[left];
//                heap[left] = heap[root];
//                heap[root] = temp;
//                break;
//            }
//            left = root * 2 + 1;
//            right = root * 2 + 2;
//            currentIndex--;
//        }
//    }
//
//    public void print() {
//        for(int num : heap) {
//            System.out.println(num);
//        }
//    }
}
