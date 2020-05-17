package com.practice.algorithm.sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements of array:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Given Array");
		printArray(a);

		MergeSort ob = new MergeSort();
		ob.sort(a, 0, a.length - 1);

		System.out.println("\nSorted array");
		printArray(a);

	}

	private void sort(int[] arr, int left, int right) {
		{
			if (left < right) {
				// Find the middle point
				int mid = (left + right) / 2;

				// Sort first and second halves
				sort(arr, left, mid);
				sort(arr, mid + 1, right);

				// Merge the sorted halves
				merge(arr, left, mid, right);
			}
		}
	}

	private void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
