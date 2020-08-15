package com.practice.ds.stackandqueue.problems.maxStack;

import java.util.Stack;

public class MaxStack {
	private Stack<Integer> mainStack;
	private int maxItem;

	public MaxStack() {
		this.mainStack = new Stack<Integer>();
		this.maxItem = 0;
	}

	public void push(int item) {
		mainStack.push(item);
		if (item >= maxItem) {
			maxItem = item;
		}
	}

	public int getMaxItem() {
		return this.maxItem;

	}

}
