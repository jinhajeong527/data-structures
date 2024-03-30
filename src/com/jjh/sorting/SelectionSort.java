package com.jjh.sorting;

public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                 min = arr[j];
                 minIndex = j;
                }
            }
            // store minimum value in temp variable
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }
}
