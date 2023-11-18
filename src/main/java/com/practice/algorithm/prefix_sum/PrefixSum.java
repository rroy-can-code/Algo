package com.practice.algorithm.prefix_sum;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of arr :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        arr = prefSum(arr);
        printArray(arr);
        System.out.println("Enter the size of queries :");
        int q = scanner.nextInt();
        for (int i = 1; i <= q; i++) {
            System.out.println("Enter i and j");
            findSumBetweenIndexes(arr, scanner.nextInt(), scanner.nextInt());
            System.out.println();
        }
        scanner.close();
    }

    static void findSumBetweenIndexes(int[] arr, int i, int j) {
        System.out.println();
        System.out.print("Sum between index i :" + i + " and j :" + j + " is ");
        if (i <= 0) {
            System.out.print(arr[j]);
        } else {
            System.out.print(arr[j] - arr[i - 1]);
        }
    }

    static int[] prefSum(int[] arr) {
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pref[i] = arr[i] + pref[i - 1];
        }
        return pref;
    }

    static void printArray(int[] arr) {
        System.out.println("PrefixSum array :");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();
    }
}
