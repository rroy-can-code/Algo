package com.practice.algorithm.sorting;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * int arr[] = new int[] { 6, 1, 8, 7, 3, 13, 9 }; bubbleSort(arr);
	 * System.out.print("After Sorting : ["); for (int i = 0; i < arr.length;
	 * i++) { System.out.print(arr[i] + ","); } System.out.print("]"); }
	 */
}