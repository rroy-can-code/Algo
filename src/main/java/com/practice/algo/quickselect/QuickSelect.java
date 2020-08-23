package com.practice.algo.quickselect;

import java.util.Random;

public class QuickSelect {
	private int[] nos;

	public QuickSelect(int[] nums) {
		this.nos = nums;
	}

	public int select(int k) {
		return select(0, nos.length - 1, k - 1);
	}

	private int select(int firstIndex, int lastIndex, int k) {
		int pivot = partition(firstIndex, lastIndex);
		if (pivot > k) {
			// go to left side In this implementation we kept bigger elements in
			// left side
			return select(firstIndex, pivot - 1, k);
		} else if (pivot < k) {
			return select(pivot + 1, lastIndex, k);// go to right side
		}
		return nos[k];
	}

	private int partition(int firstIndex, int lastIndex) {
		int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
		swap(lastIndex, pivot);
		for (int i = firstIndex; i < lastIndex; i++) {
			// If we reverse the condition we can
			// find smallest elements instead of largest elts
			if (nos[i] > nos[lastIndex]) {
				swap(i, firstIndex);
				firstIndex++;
			}
		}
		swap(firstIndex, lastIndex);
		return firstIndex;
	}

	// Utility method
	private void swap(int i, int j) {
		// Store the val of nos[i] in a var
		int temp = nos[i];
		// put the nos[j] val to nos[i]
		nos[i] = nos[j];
		// now insert temp val to nos[j]
		nos[j] = temp;
	}

}
