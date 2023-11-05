package com.practice.algorithm.sorting;

/**
 * Insertion Sort is exactly similar to how we arrange deck of cards
 * eg: I got cards in this order
 * 4,3,5,2,1
 * 1. put 3 first then 4 and 1 will be before 2
 * it looks like 3,4,5,1,2
 * then move 1 and 2 at first and second pos
 * 1,2,3,4,5
 * <p>
 * Basically I will start from second element and I will
 * try to push the element to the left if possible
 */
public class InsertionSort implements Sort<Integer> {

    @Override
    public void sort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int pivot = arr[i];
            // need to push the element to left as mu as possible
            while (j >= 0 && arr[j] > pivot) {
                arr[j + 1] = arr[j]; // move current element to right making place for pivot
                j--;
            }
            arr[j + 1] = pivot;
        }
    }
}
