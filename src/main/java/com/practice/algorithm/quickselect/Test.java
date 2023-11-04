package com.practice.algorithm.quickselect;

public class Test {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 8, 4, -2 };
		QuickSelect qs = new QuickSelect(nums);
		System.out.println(qs.select(3));
	}

}
