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
}
