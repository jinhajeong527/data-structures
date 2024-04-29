package com.jjh.heaps;

public class PriorityQueueWithHeap {
    private Heap heap = new Heap(10);
    public void add(int item) {
        heap.insert(item);
    }

    public int remove() {
        return heap.remove();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
