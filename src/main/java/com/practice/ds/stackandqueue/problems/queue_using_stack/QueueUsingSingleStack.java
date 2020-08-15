package com.practice.ds.stackandqueue.problems.queue_using_stack;

import java.util.Stack;

public class QueueUsingSingleStack {
	private Stack<Integer> stack;

	public QueueUsingSingleStack() {
		this.stack = new Stack<Integer>();
	}

	public void enqueue(int item) {
		this.stack.push(item);
	}

	public int dequeue() {
		//Base condition
		if (this.stack.size() == 1) {
			return this.stack.pop();
		}
		int item = stack.pop();
		// Calling recursively
		int lastDequeuedItem = dequeue();
		enqueue(item);
		return lastDequeuedItem;
	}

}
