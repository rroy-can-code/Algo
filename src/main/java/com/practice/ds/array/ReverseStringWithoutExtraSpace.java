package com.practice.ds.array;

import java.util.Arrays;

public class ReverseStringWithoutExtraSpace {

	public static String reverseString(String s) {
		char[] ch = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			reverse(ch, start, end);
			start++;
			end--;
		}
		return Arrays.toString(ch);
	}

	private static void reverse(char[]ch , int start, int end) {
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("RAHUL"));
	}

}
