package com.practice.algorithm.sorting;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int arr[] = new int[] { 6, 1, 8, 7, 3, 13, 9 };
		System.out.print("Enter Sorting type :");
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		if (ip == 1) {
			BubbleSort.bubbleSort(arr);
			print(arr, "Bubble Sort");
		} else if (ip == 2) {
			SelectionSort.selectionSort(arr);
			print(arr, "Selection Sort");
		}
		sc.close();
	}

	static void print(int arr[], String sortType) {
		System.out.print("After Sorting using " + sortType + ": [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");

	}

}
