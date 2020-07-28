package com.practice.ds.array;

/**
 * 
 * @author Rahul
 * 
 * Program to move all zeros to end of an array
 *
 */
public class MoveZerosToEnd {
	static void pushZerosToEnd(int arr[]) {
		int count = 0; // Count of non-zero elements

		// Traverse the array. If element encountered is
		// non-zero, then replace the element at index 'count'
		// with this element
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i]; // here count is
										// incremented

		// Now all non-zero elements have been shifted to
		// front and 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < arr.length)
			arr[count++] = 0;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 9, 6, 4, 0, 0, 2, 7 };
		pushZerosToEnd(arr);
		System.out.println("Array after moving zeros to the end: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
