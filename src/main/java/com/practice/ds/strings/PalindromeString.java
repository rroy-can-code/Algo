package com.practice.ds.strings;

import java.util.Scanner;

/**
 * 
 * Objective is to check if a string is palindrome or not Eg. MADAM is same when
 * it is reversed
 *
 */
public class PalindromeString {
	/**
	 * StringBuilder implementation
	 * 
	 * @param st
	 * @return boolean
	 */
	private static boolean isPalindromeUsingSB(String st) {
		StringBuilder sb = new StringBuilder(st);
		return st.equals(sb.reverse().toString());
	}

	/**
	 *
	 * @param st
	 * @return boolean
	 */
	private static boolean isPalindrome(String st) {
		int start = 0, end = st.length() - 1;
		while (start < end) {
			if (st.charAt(start) == st.charAt(end))
				return true;
			start++;
			end--;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		// System.out.println(isPalindromeUsingSB(sc.nextLine()));
		System.out.println(isPalindrome(sc.nextLine()));
		sc.close();
	}

}
