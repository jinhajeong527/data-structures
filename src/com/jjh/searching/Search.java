package com.jjh.searching;

public class Search {
    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public int binarySearch_recursive(int[] arr, int key) {
        return binarySearch_recursive(arr, key, 0, arr.length - 1);
    }

    private int binarySearch_recursive(int[] arr, int key, int left, int right) {
        // base condition: out partition or segment is empty
        if (left > right) return -1;

        int mid = (right + left) / 2;

        if (arr[mid] == key) return mid;

        if (arr[mid] < key)
            return binarySearch_recursive(arr, key, mid + 1, right);

        return binarySearch_recursive(arr, key, left, mid -1);
    }
    public int ternarySearch_recursive(int[] arr, int key) {
       return ternarySearch_recursive(arr, key, 0, arr.length -1);
    }

    private int ternarySearch_recursive(int[] arr, int key, int left, int right) {
        // base condition
        if (left > right) return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (key == arr[mid1]) return mid1;
        if (key == arr[mid2]) return mid2;

        if (key < arr[mid1]) {
            return ternarySearch_recursive(arr, key, left, mid1 - 1);
        }
        if (key > arr[mid2]) {
            return ternarySearch_recursive(arr, key, mid2 + 1, right);
        }
        return ternarySearch_recursive(arr, key, mid1 + 1, mid2 - 1);
    }

    public int binarySearch_iterative(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        // While we have a partition or a segment that has at least one element.
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key)
                return mid;

            if (key < arr[mid])
                right = mid -1;
            else
                left = mid + 1;
        }
        return -1;
    }
    public int jumpSearch(int[] arr, int key) {
        int length = arr.length;
        // calculate the ideal size of the block
        int blockSize = (int) Math.sqrt(length);
        int start = 0;
        int next = blockSize;
        while (start < length
                && arr[next -1] < key) {
            start = next;
            next += blockSize;
            if (next > length) {
                next = arr.length;
            }
        }
        for (int i = start; i < next; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int exponentialSearch(int[] arr, int key) {
        int bound = 1;
        while (bound < arr.length
                && arr[bound] < key) {
            bound *= 2;
        }
        int left = bound / 2;
        // In case bound is same or bigger than the arr.length
        int right = Math.min(bound, arr.length - 1);
        return binarySearch_recursive(arr, key, left, right);
    }
}
