package com.leetcode.maxStack;

import java.util.Stack;

public class MaxStackWithPopAllowed {
	private Stack<Integer> mainStack;
	private Stack<Integer> maxStack;

	public MaxStackWithPopAllowed() {
		this.mainStack = new Stack<Integer>();
		this.maxStack = new Stack<Integer>();
	}

	public void push(int item) {
		mainStack.push(item);
		if (mainStack.size() == 1) {
			maxStack.push(item);
		}
		if (item > maxStack.peek()) {
			maxStack.push(item);
		} else {
			maxStack.push(maxStack.peek());
		}
	}

	public Integer pop() {
		maxStack.pop();
		return mainStack.pop();
	}

	public int getMax() {
		return maxStack.peek();
	}
}
