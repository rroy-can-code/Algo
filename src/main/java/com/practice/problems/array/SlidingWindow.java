package com.practice.problems.array;

/**
 * Determine max sum of k consecutive elements in an array
 */
public class SlidingWindow {

    public int maxSumKConsecutiveElts(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1;
        }
        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
