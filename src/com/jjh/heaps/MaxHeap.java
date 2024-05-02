package com.jjh.heaps;

public class MaxHeap {
    public static void heapify(int[] array) {
        int lastParentIndex = array.length / 2 - 1;
        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(array, i);
        }
    }

    private static void heapify(int[] array, int index) {
        int largerIndex = index;
        int left = index * 2 + 1;
        if (left < array.length && array[left] > array[largerIndex]) {
            largerIndex = left;
        }
        int right = index * 2 + 2;
        if (right < array.length && array[right] > array[largerIndex]) {
            largerIndex = right;
        }
        // This item is greater that both of its children
        if (index == largerIndex)
            return;

        swap(array, index, largerIndex);
        heapify(array, largerIndex);
    }

    public static int getKthLargest(int[] arr, int k) {
        if (k < 1 || k > arr.length)
            throw new IllegalArgumentException();

        Heap heap = new Heap(arr.length);
        for (int number: arr) {
            heap.insert(number);
        }
        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }
        return heap.max();
    }

    public static boolean isMaxHeap(int[] arr) {
        if (arr.length == 0) {
            return true;
        }
        return isMaxHeap(arr, 0);
    }

    private static boolean isMaxHeap(int[] arr, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if (left < arr.length && arr[index] < arr[left]) {
            return false;
        }
        if (right < arr.length && arr[index] < arr[right]) {
            return false;
        }

        return (left >= arr.length || isMaxHeap(arr, left))
                && (right >= arr.length || isMaxHeap(arr, right));
    }


    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
