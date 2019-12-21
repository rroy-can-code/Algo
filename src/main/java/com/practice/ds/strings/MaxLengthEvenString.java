package com.practice.ds.strings;

import java.util.Scanner;

public class MaxLengthEvenString {

	public static void main(String... a) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sting");
		System.out.println(findMaxLenEven(sc.nextLine()));
		sc.close();
	}

	private static String findMaxLenEven(String str) {
		int currLen = 0, maxLen = 0, i = 0;
		// To store starting index of maximum
		// length word.
		int startIndex = -1;
		while (i < str.length()) {
			// If current character is space then
			// word has ended.
			if (str.charAt(i) == ' ') {
				// Even so len %2==0
				if (currLen % 2 == 0) {
					if (maxLen < currLen) {
						// if true then store maxLen as currlen and startIndex
						// will be i-currlen
						// this is a test string
						// i=4 so maxlen=4
						// so st index will be 4-4

						// string
						// i=20
						// currlen>maxlen
						// so maxlen=clen
						// si=20-6
						maxLen = currLen;
						startIndex = i - currLen;
					}
				}
				currLen = 0;// Set currlen to zero for next word
			} else {
				currLen++;
			}
			i++;
		}

		// Check length of last word .coz it will not find " "
		if (currLen % 2 == 0) {
			if (maxLen < currLen) {
				maxLen = currLen;
				startIndex = i - currLen;
			}
		}

		return startIndex != -1 ? str.substring(startIndex, startIndex + maxLen)
				: "No Even string is present in given sentence"; // 14 to 14+6
	}
}
