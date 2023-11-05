package com.practice.algorithm.sorting;

/**
 * divide arr by 2 parts.Sorted and unsorted. Select min elt from
 * unsorted arr and put into sorted arr
 */

public class SelectionSort implements Sort<Integer> {
    public void sort(Integer[] arr) {
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            int min = j;
            for (int i = j + 1; i < n; i++) {
                if (arr[i] < arr[min]) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
    }
}
