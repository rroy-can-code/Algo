package com.practice.algorithm.dp;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

	private int naiveApproach(int n) {
		if (n == 0 || n == 1)
			return n;
		return naiveApproach(n - 2) + naiveApproach(n - 1);
	}

	public Map<Integer, Integer> memizeTable;

	public FibonacciNumbers() {
		memizeTable = new HashMap<Integer, Integer>();
		memizeTable.put(0, 0);
		memizeTable.put(1, 1);
	}

	public int getFibNoDP(int n) {
		if (memizeTable.containsKey(n)) {
			return memizeTable.get(n);
		}
		memizeTable.put(n - 1, getFibNoDP(n - 1));
		memizeTable.put(n - 2, getFibNoDP(n - 2));
		int calculatedNo = memizeTable.get(n - 1) + memizeTable.get(n - 2);
		memizeTable.put(n, calculatedNo);
		return calculatedNo;
	}

	public static void main(String[] args) {
		FibonacciNumbers fib = new FibonacciNumbers();
		// System.out.println(fib.naiveApproach(5));

		System.out.println(fib.getFibNoDP(6));

	}

}
