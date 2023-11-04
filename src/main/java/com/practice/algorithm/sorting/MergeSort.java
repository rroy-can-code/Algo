package com.practice.algorithm.sorting;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);

    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private void sort(int[] arr, int left, int right) {
        {
            if (left < right) {
                // Find the middle point
                int mid = left + (right - left) / 2;

                //recursively dividing the array
                sort(arr, left, mid);
                sort(arr, mid + 1, right);

                // Merge the sorted halves
                merge(arr, left, mid, right);
            }
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        /* Copy data to temp arrays */
		System.arraycopy(arr, left + 0, leftArr, 0, n1);
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

}
