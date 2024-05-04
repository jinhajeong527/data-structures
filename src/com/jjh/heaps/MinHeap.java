package com.jjh.heaps;

import java.util.Collections;
import java.util.List;

public class MinHeap {
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
