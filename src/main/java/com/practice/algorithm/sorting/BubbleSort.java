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
			System.out.println("At i= "+ i +" outer loop : ");
			
			for (int j = 0; j < n - i - 1; j++) {
				System.out.println("At j= "+j +" inner loop : ");
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
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
}
