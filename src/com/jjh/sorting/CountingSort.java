package com.jjh.sorting;

public class CountingSort {
    public void sort(int[] arr) {
        int max = findMax(arr);
        if (max == -1) return;

        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int start = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
               arr[start++] = i;
               count[i]--;
            }
        }
    }
    private int findMax(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
