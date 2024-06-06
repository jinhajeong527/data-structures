package com.jjh.arrays;


public class Array {
    private int[] items;
    private int count = 0;
    public Array(int size) {
        items = new int[size];
    }
    public void insert(int item) {
        if (items == null) {
            items = new int[5];
        }
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];
            // Copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // Set "items" to this new array
            items = newItems;
        }
        // Add the new item at the end
        items[count++] = item;
    }

    public void print() {
        for (int i = 0 ; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
