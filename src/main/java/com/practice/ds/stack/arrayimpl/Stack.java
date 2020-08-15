package com.practice.ds.stack.arrayimpl;

public class Stack<T> {
	private T[] stack;
	private int noOfItems;

	@SuppressWarnings("unchecked")
	public Stack() {
		this.stack = (T[]) new Object[1];
	}

	// O(1) if no resize
	public void push(T newData) {
		if (noOfItems == this.stack.length) {
			resize(2 * this.stack.length);
		}
		this.stack[noOfItems++] = newData;
	}

	// O(1) if no resize
	public T pop() {
		T itemToPop = this.stack[--noOfItems];
		if (noOfItems > 0 && noOfItems == this.stack.length / 4) {
			resize(this.stack.length / 2);
		}
		return itemToPop;
	}

	public boolean isEmpty() {
		return this.noOfItems == 0;
	}

	public int size() {
		return this.noOfItems;
	}

	// O(N) linear TC
	@SuppressWarnings("unchecked")
	private void resize(int capacity) {
		T[] itemsToCopy = (T[]) new Object[capacity];
		for (int i = 0; i < noOfItems; i++) {
			itemsToCopy[i] = stack[i];
		}
		this.stack = itemsToCopy;
	}
}
