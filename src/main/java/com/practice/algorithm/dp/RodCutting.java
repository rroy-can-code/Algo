package com.practice.algorithm.dp;

public class RodCutting {
	private int[][] dpTable;
	private int length;
	private int[] price;

	public RodCutting(int length, int[] price) {
		super();
		this.length = length;
		this.price = price;
		this.dpTable = new int[price.length + 1][length + 1];
	}

	public void solve() {
		for (int i = 1; i < price.length; i++) {
			for (int j = 1; j <= length; j++) {
				if (i <= j) {
					dpTable[i][j] = Math.max(dpTable[i - 1][j], price[i] + dpTable[i - 1][j - i]);
				} else {
					dpTable[i][j] = dpTable[i - 1][j];
				}

			}
		}
	}

	public void showResult() {
		System.out.println("Optimal profit: $" + dpTable[price.length - 1][length]);
		for (int n = price.length - 1, w = length; n > 0;) {
			if (dpTable[n][w] != 0 && dpTable[n][w] != dpTable[n - 1][w]) {
				System.out.println("We make cut " + n + "m");
				w = w - n;
			} else {
				n--;
			}

		}
	}

	public static void main(String[] args) {
		int len = 5;
		int[] prices = { 0, 2, 5, 7, 3 };
		RodCutting cutting = new RodCutting(len, prices);
		cutting.solve();
		cutting.showResult();

	}

}
