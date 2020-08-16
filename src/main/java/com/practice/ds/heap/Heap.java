package com.practice.ds.heap;

public class Heap {
	//public static final int HEAP_CAPACITY = 10;
	private int[] heap;
	private int heapSize;

	public Heap() {
		this.heap = new int[10];
		this.heapSize = 0;
	}

	private boolean isFull() {
		return this.heapSize == 10;
	}

	private void swap(int index1, int index2) {
		int temp = this.heap[index1];
		this.heap[index1] = this.heap[index2];
		this.heap[index2] = temp;
	}

	public void insert(int item) {
		if (isFull()) {
			throw new RuntimeException("Heap is full");
		}
		// insert the item and increment the counter
		this.heap[heapSize] = item;
		heapSize = heapSize + 1;

		// fixUp() if required to heapify
		fixUp(heapSize - 1);
	}

	private void fixUp(int index) {
		int parentIndex = (index - 1) / 2;
		// While index>0 means until consider all the items " above" the one we
		// inserted
		// we have to swap the node with parent
		if (index > 0 && heap[index] > heap[parentIndex]) {
			swap(index, parentIndex);
			fixUp(parentIndex);
		}
	}

	// peek method
	public int getMax() {
		return this.heap[0];
	}

	// Removes and return max item from heap
	public int poll() {
		int max = getMax();
		swap(0, this.heapSize - 1);
		this.heapSize--;
		fixDown(0);
		return max;
	}

	private void fixDown(int index) {
		int leftIndex = 2 * index + 1;
		int rightIndex = 2 * index + 2;

		int largestIndex = index;
		if (leftIndex < heapSize && heap[leftIndex] > heap[index]) {
			largestIndex = leftIndex;
		}
		if (rightIndex < heapSize && heap[rightIndex] > heap[index]) {
			largestIndex = rightIndex;
		}
		if (index != largestIndex) {
			swap(index, largestIndex);
			fixDown(largestIndex);
		}

	}

	public void heapSort() {
		for (int i = 0; i < this.heapSize; i++) {
			int max = poll();
			System.out.print(max + " ");
		}
	}

}
