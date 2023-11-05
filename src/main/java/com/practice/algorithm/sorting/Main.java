package com.practice.algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    //TODO : Implement Strategy pattern than factory
    public static void main(String[] args) throws Exception {
        System.out.println("Enter Sorting type (The number represents to each sorting):");
        Arrays.stream(SortType.values())
                .forEach(sortType -> System.out.println(sortType.ordinal() + " : " + sortType.name()));
        List<Integer> ordinals = Arrays.stream(SortType.values())
                .map(Enum::ordinal)
                .collect(Collectors.toList());
        SortFactory sf = new SortFactory();
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();
        if (!ordinals.contains(ip)) {
            System.out.println("Wrong input selected : " + ip);
            return;
        }
        SortType sortingType = Arrays.stream(SortType.values())
                .filter(sortType -> sortType.ordinal() == ip)
                .findFirst().get();

        System.out.println("You have selected : " +
                sortingType.name());

        System.out.println("Enter Size of arr ");
        int size = sc.nextInt();
        Number[] arr;
        System.out.println("Please enter the elements");
        Sort sort;
        // For bucket sort input type is float
        if (ip == 5) {
            arr = new Float[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextFloat();
            }
        } else {
            arr = new Integer[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        }
        sort = sf.getSortingAlgo(sortingType);
        sc.close();
        sort.sort(arr);
        print(arr, sortingType.name());
    }


    static void print(Number[] arr, String sortType) {
        System.out.print("After Sorting using " + sortType + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

    }

}
