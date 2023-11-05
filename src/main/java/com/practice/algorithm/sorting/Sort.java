package com.practice.algorithm.sorting;

public interface Sort<T> {
    void sort(T[] arr);

    default void swap( Integer arr[], int i, int j){
       int temp= arr[i];
       arr[i]= arr[j];
       arr[j]= temp;
    }

}
