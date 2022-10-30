package com.practice.ds.strings;

/**
 * Given an array of positive integers,
 * find the longest subarray where
 * the absolute difference between any two elements is less than or equal to 1.
 * Example
 * a = [4, 1, 1, 2, 2, 4, 5, 5, 5, 6]
 * a = [ 1, 1, 2, 2, 3, 4,4, 5, 5, 5, 6]
 * [1, 1, 2, 2] and [4, 4, 5, 5, 5], [5, 5, 5, 6]
 * the longest sub array is [4, 4, 5, 5, 5] and its length is 5
 */
public class LongestSubArrWithMaxDiffOne {

    public static void main(String[] args) {
     LongestSubArrWithMaxDiffOne arr = new LongestSubArrWithMaxDiffOne();
        System.out.println(arr.longestSubArray(new int[]{4, 1, 1, 2, 2, 4, 5, 5, 5, 6}));
    }

    public int longestSubArray(int[] arr) {
        int i = 0;
        int maxLen = 0;
        int len = arr.length;

        while (i < len) {
            int j = i;
            while (i + 1 < len && (Math.abs(arr[i] - arr[i + 1]) == 1 || Math.abs(arr[i] - arr[i + 1]) == 0)) {
                i++;
            }
            int currLen = i - j + 1;
            if (maxLen < currLen) {
                maxLen = currLen;
            }
            if(i==j) i++;

        }
        maxLen = (maxLen == 1) ? 0 : maxLen;
        return maxLen;

    }


}
