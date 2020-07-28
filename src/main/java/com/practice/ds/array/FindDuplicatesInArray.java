package com.practice.ds.array;

public class FindDuplicatesInArray {
	public static void findDuplicates(int a[]) {
		//O(n) time no extra space
		for (int i = 0; i < a.length; i++) {
			if (a[Math.abs(a[i])] > 0) {
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
			} else {
				System.out.println(Math.abs(a[i]) + " is a duplicate element");
			}
		}
	}

	public static void main(String[] args) {
		int a[]={1,2,3,1,2,4};
		findDuplicates(a);

	}

}
