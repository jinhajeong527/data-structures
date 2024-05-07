package com.jjh.heaps;

public class MinPriorityQueue {
    MinHeap mh = new MinHeap();

    public void add(String value, int priority) {
        mh.insert(priority, value);
    }

    public String remove() {
        return mh.remove();
    }

     public boolean isEmpty() {
        return mh.isEmpty();
     }
}
