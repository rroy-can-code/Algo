package com.practice.algo.dp;

public class CoinChange {

	public int naiveCoinChange(int M, int[] v, int index) {
		if (M < 0)
			return 0;
		if (M == 0)
			return 1;
		if (v.length == index)
			return 0;

		return naiveCoinChange(M - v[index], v, index) + naiveCoinChange(M, v, index + 1);
	}
	
	/* 
	 * DP approach
	 * 
	 *   0 1 2 3 4 -> totAmt
	 * 0 1 0 0 0 0
	 * 1 1 1 1 1 1
	 * 2 1 0 2 2 3
	 * 3 1 1 2 3 4
	 * |
	 * coins
	 * dptable [coins][amt]=dptable[coins-1][amt] +dptable[coins][totAmt-val[coins-1]; if val[coins]<=amt i.e we are taking
	 * dptable [coins][amt]=dptable [coins-1][amt]
	 * 
	 * */
	
	
	
	public int dpCoinChange(int totalAmount, int[] values) {
		int dpTable[][] = new int[values.length + 1][totalAmount + 1];
		for (int i = 0; i <= values.length; i++) {
			dpTable[i][0] = 1;
		}
		for (int i = 0; i <= totalAmount; i++) {
			dpTable[0][i] = 0;
		}
		for (int coins = 1; coins <= values.length; coins++) {
			for (int amt = 1; amt <= totalAmount; amt++) {
				if (values[coins - 1] <= amt) {
					dpTable[coins][amt] = dpTable[coins - 1][amt] + dpTable[coins][amt - values[coins - 1]];
				} else {
					dpTable[coins][amt] = dpTable[coins - 1][amt];
				}
			}
		}
		return dpTable[values.length][totalAmount];
	}

	public static void main(String[] args) {
		int M = 4;
		int v[] = { 1, 2, 3 };
		CoinChange coinChange = new CoinChange();
		//System.out.println(coinChange.naiveCoinChange(M, v, 0));
		System.out.println(coinChange.dpCoinChange(M, v));
	}

}
