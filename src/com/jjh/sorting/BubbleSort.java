package com.jjh.sorting;

public class BubbleSort {
    public void sort(int[] numbers) {
        int size = numbers.length;
        boolean sorted;
        for (int i = 0; i < size; i++) {
            sorted = true;
            for (int j = 1; j < size -i; j++) {
                if (numbers[j] < numbers[j-1]) {
                    sorted = false;
                    swap(numbers, j, j-1);
                }
            }
            if (sorted) return;
        }
    }

    private void swap(int[] numbers, int index1, int index2) {
        int tmp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = tmp;
    }
}
