package com.practice.algorithm.sorting;
/**
 * 
 * @author Rahul
 *swap adjacent elements if they are in wrong order
 */
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
}
