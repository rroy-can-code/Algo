package com.practice.ds.array;

/**
 * Largest sum contiguous subarray
 *
 * Here 2 friends Ram(maxSoFar) and Shyam (maxEndingHere)
 * Ram is saying Shyam that you take every val from array and reset yourself when your value is <0 and keep track of the index also
 * I will update myself when your value is greater than mine
 * Finally I will return max value
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
                maxSoFar = maxEndingHere;// Ram is resetting value as Shyam's  value is gt him
                start = s;
                end = i;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0; //shyam is resetting value
                s = i + 1;// and current index is rejected with a hope that from next index it will start getting max value
            }
        }
        System.out.println("Maximum contiguous sum is "
                + maxSoFar);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
        return maxSoFar;
    }
}
