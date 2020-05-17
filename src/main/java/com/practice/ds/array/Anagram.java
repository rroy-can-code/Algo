package com.practice.ds.array;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String subject, String anagram) {
		char[] first = subject.toCharArray();
		char[] second = anagram.toCharArray();
		if (first.length != second.length)
			return false;
		// O(nlogn)
		Arrays.sort(first);
		Arrays.sort(second);
		// O(n)
		for (int i = 0; i < first.length; i++) {
			if (first[i] != second[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("restful", "flutter"));

	}

}
