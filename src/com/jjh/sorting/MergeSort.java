package com.jjh.sorting;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int[] arr) {
        // base condition: when to stop recursion?
        // when there's only one single item in the array.
        if (arr.length > 1) {
            // get the min index
            int mid = arr.length / 2;
            int[] left =  sort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
            // merge the result
            merge(arr, left, right);
        }
        return arr;
    }

    private void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
}
