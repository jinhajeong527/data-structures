package com.jjh.sorting;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int[] arr) {
        if (arr.length > 1) {
            // get the min index
            int mid = arr.length / 2;
            int[] left =  sort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
            merge(arr, left, right);
        }
        return arr;
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
