package com.practice.algorithm.sliding_window;

import java.util.Scanner;

/**
 * Find maximum sum in an array of size k
 */
public class SlidingWindowAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the window size : ");
        int k = scanner.nextInt();
        scanner.close();
        System.out.println("Maximum sum of window size k " + k + " : " + maxWindowSum(array, n, k));
    }

    static int maxWindowSum(int[] array, int n, int k) {
        if (n < k) return -1;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += array[i] - array[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
