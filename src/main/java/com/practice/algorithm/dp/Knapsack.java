package com.practice.algorithm.dp;

public class Knapsack {
	private int noOfItems;
	private int capacity;
	private int[][] knapsackTable;
	private int totalBenefit;
	private int[] weights;
	private int[] values;

	public Knapsack(int noOfItems, int capacity, int[] weights, int[] values) {
		super();
		this.noOfItems = noOfItems;
		this.capacity = capacity;
		this.knapsackTable = new int[noOfItems + 1][capacity + 1];
		this.weights = weights;
		this.values = values;
	}

	public void solve() {
		// TC O(noOfItems*w)
		for (int i = 1; i < noOfItems + 1; i++) {
			for (int w = 1; w < capacity + 1; w++) {
				int notTakingItem = knapsackTable[i - 1][w];
				int takingItem = 0;
				if (weights[i] <= w) {
					takingItem = values[i] + knapsackTable[i - 1][w - weights[i]];
				}
				knapsackTable[i][w] = Math.max(notTakingItem, takingItem);
			}

		}
		totalBenefit = knapsackTable[noOfItems][capacity];
	}

	public void showResult() {
		System.out.println("totalBenefit=" + totalBenefit);
		for (int n = noOfItems, w = capacity; n > 0; n--) {
			if (knapsackTable[n][w] != 0 && knapsackTable[n][w] != knapsackTable[n - 1][w]) {
				System.out.println("We take item #" + n);
				w -= weights[n];
			}
		}
	}

	public static void main(String[] args) {
		int noOfItems = 3;
		int capacity = 5;
		int[] weights = new int[noOfItems + 1];
		weights[1] = 4;
		weights[2] = 2;
		weights[3] = 3;
		int[] values = new int[noOfItems + 1];
		values[1] = 10;
		values[2] = 4;
		values[3] = 7;

		Knapsack knapsack = new Knapsack(noOfItems, capacity, weights, values);
		knapsack.solve();
		knapsack.showResult();
	}

}
