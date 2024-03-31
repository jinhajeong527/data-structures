package com.jjh.sorting;

public class InsertionSort {
    public void sort(int[] arr) {
        // start from index 1
        // because when we read the first item we assume it's in the correct position
        for (int i = 1; i < arr.length; i++) {
            int sortNeeded = arr[i];
//            int j = i;
//            for (; j > 0 && arr[j-1] > sortNeeded; j--) {
//                // if the value of arr[j-1] is bigger than the value of arr[j]
//                // move the value of arr[j-1] to arr[j]
//                arr[j] = arr[j-1];
//            }
//            arr[j] = sortNeeded;
            int j = i - 1;
            while (j >= 0 && arr[j] > sortNeeded) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = sortNeeded;
        }
    }
}
