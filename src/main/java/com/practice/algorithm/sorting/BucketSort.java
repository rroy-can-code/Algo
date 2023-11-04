package com.practice.algorithm.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        float[] arr = new float[]{0.13f, 0.72f, 0.17f, 0.38f, 0.35f, 0.19f, 0.31f};
        System.out.println("Input arr........");
        printArray(arr);
        bucketSort(arr);
        System.out.println("Output arr........");
        printArray(arr);
    }

    private static void printArray(float[] arr) {
        for (int idx = 0; idx < arr.length-1; idx++) {
            System.out.print(arr[idx]+", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println();
    }

    /**
     * We create another array of list
     * multiply input array elements with input array size
     * convert to int
     * we get index of those elements, and we group the elements to corresponding index like this
     * Then we sort those elements
     * finally for each idx in temp array we copy one by one elt in input arr
     * @param arr
     */
    static void bucketSort(float[] arr) {
        int n = arr.length;
        // Array of list
        List<Float>[] buckets = new List[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        // convert and add in temp arr
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int) idx].add(arr[i]);
        }
        // sort each list inside temp arr

        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        //copying one by one to original arr
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[idx++] = buckets[i].get(j);
            }
        }
    }
}
