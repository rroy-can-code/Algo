package com.practice.algorithm.sorting;

/**
 * 
 * @author Rahul 
 * divide arr by 2 parts.Sorted and unsorted. Select min elt from
 * unsorted arr and put into sorted arr
 *
 */

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for (int j = 0; j < n; j++) {
			System.out.println("At j= " + j + " outer loop : ");
			int iMin = j;
			System.out.println("iMin =" + arr[iMin]);
			for (int i = j + 1; i < n; i++) {
				System.out.println("At i= " + i + " inner loop : ");
				if (arr[i] < arr[iMin]) {
					int temp = arr[i];
					arr[i] = arr[iMin];
					arr[iMin] = temp;
				}
				System.out.print("[");
				for (int p = 0; p < arr.length; p++) {
					System.out.print(arr[p] + " ");
				}
				System.out.print("]");
				System.out.println("");
			}
		}
	}
}
