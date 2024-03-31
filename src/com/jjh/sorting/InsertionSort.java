package com.jjh.sorting;

public class InsertionSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int sortNeeded = arr[i];
            int j = i;
            for (; j > 0 && arr[j-1] > sortNeeded; j--) {
                // if the value of arr[j-1] is bigger than the value of arr[j]
                // move the value of arr[j-1] to arr[j]
                arr[j] = arr[j-1];
            }
            arr[j] = sortNeeded;
        }
    }
}
