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

    public int binarySearch_recursive(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (right + left) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        int foundValue;
        if (arr[mid] < key) {
            foundValue = binarySearch_recursive(arr, key, mid + 1, right);
        } else {
            foundValue = binarySearch_recursive(arr, key, left, mid -1);
        }
        return foundValue;
    }
}
