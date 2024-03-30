package com.jjh.sorting;

public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(arr, i);
            swap(arr, minIndex, i);
        }
    }

    private int findMinIndex(int[] arr, int i) {
        int minIndex = i;
        for (int j = i; j < arr.length; j++) {
            if (arr[minIndex] > arr[j]) {
             minIndex = j;
            }
        }
        return minIndex;
    }

    private void swap(int[] arr, int index1, int index2) {
        // store minimum value in temp variable
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
