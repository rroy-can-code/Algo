package com.practice.algorithm.sorting;

public class SortFactory {
    Sort getSortingAlgo(SortType sortType) throws Exception {
        Sort sort;
        switch (sortType) {
            case SELECTION_SORT:
                sort = new SelectionSort();
                break;
            case BUBBLE_SORT:
                sort = new BubbleSort();
                break;
            case INSERTION_SORT:
                sort = new InsertionSort();
                break;
            case MERGE_SORT:
                sort = new MergeSort();
                break;
            case QUICK_SORT:
                sort = new QuickSort();
                break;
            case BUCKET_SORT:
                sort = new BucketSort();
                break;
            default:
                throw new Exception("Sorting type not exists");
        }
        return sort;
    }
}
