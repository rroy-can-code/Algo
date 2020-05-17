package com.practice.algorithm.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);

		System.out.println("sorted array");
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

	private void sort(int[] arr, int start, int end) {
		if (start < end) {
			int partition = doPartition(arr, start, end);
			sort(arr, start, partition - 1);
			sort(arr, partition + 1, end);
		}

	}

	/*
	 * This function takes last element as pivot, places the pivot element at
	 * its correct position in sorted array, and places all smaller (smaller
	 * than pivot) to left of pivot and all greater elements to right of pivot
	 */
	private int doPartition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = (start - 1); // index of smaller element
		for (int j = start; j < end; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;

		return i + 1;
	}

}
