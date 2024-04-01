package com.jjh.sorting;

public class QuickSort {
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
    private void sort(int[] arr, int startIndex, int endIndex) {
        // need to stop when there's only one item in the array or empty array.
        if (startIndex >= endIndex)
            return;
        int boundary = partition(arr, startIndex, endIndex);
        // Sort left
        sort(arr, startIndex, boundary - 1);
        // Sort right
        sort(arr, boundary + 1, endIndex);
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int boundary = startIndex - 1;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, ++boundary);
            }
        }
        // index of the pivot after its move
        return boundary;
    }

    private void swap(int[] numbers, int index1, int index2) {
        int tmp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = tmp;
    }
}
