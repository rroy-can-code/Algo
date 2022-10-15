package com.practice.problems.array;

/**
 * Largest sum contiguous subarray
 */
public class KadanesAlgorithm {
    public int maxSubArraySum(int[] arr) {
        int n = arr.length;
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        int start = 0, end = 0, s = 0;
        for (int i = 0; i < n; i++) {
            maxEndingHere += arr[i];

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                + maxSoFar);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
        return maxSoFar;
    }
}
