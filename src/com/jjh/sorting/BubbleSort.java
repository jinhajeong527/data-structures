package com.jjh.sorting;

public class BubbleSort {
    public void sort(int[] numbers) {
        int size = numbers.length;
        if (size == 0) {
            return;
        }

        for (int i = 0; i < size; i++) {
            boolean sorted = false;
            for (int j = 1; j < size -i; j++) {
                if (numbers[j] < numbers[j-1]) {
                    sorted = true;
                    int tmp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = tmp;
                }
            }
            if (!sorted) return;
        }
    }
}
