package com.jjh.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public void sort(int[] arr, int numberOfBucket) {
        int i = 0;
        for (List<Integer> bucket : createBuckets(arr, numberOfBucket)) {
            // Use quick sort method  in java
            Collections.sort(bucket);
            for (int item: bucket) {
                arr[i++] = item;
            }
        }
    }

    private List<List<Integer>> createBuckets(int[] arr, int numberOfBucket) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < numberOfBucket; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int item : arr) {
            buckets.get(item / numberOfBucket).add(item);
        }
        return buckets;
    }
}
