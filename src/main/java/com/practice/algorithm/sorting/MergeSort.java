package com.practice.algorithm.sorting;

public class MergeSort implements Sort<Integer> {

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private void mergeSort(Integer[] arr, int left, int right) {
        {
            if (left < right) {
                // Find the middle point
                int mid = left + (right - left) / 2;

                //recursively dividing the array
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);

                // Merge the sorted halves
                merge(arr, left, mid, right);
            }
        }
    }

    private void merge(Integer[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        /* Copy data to temp arrays */
        for (int j = 0; j < n1; j++)
            leftArr[j] = arr[left + j];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of leftArrif any */
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    @Override
    public void sort(Integer[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }
}
