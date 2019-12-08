package com.practice.algorithm.sorting;

public class Main {
	public static void main(String[] args) {

		int arr[] = new int[] { 6, 1, 8, 7, 3, 13, 9 };
		BubbleSort.bubbleSort(arr);
		System.out.print("After Sorting : [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		
	}

}
