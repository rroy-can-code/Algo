package com.practice.ds.stack.llimpl;

public class Stack<T extends Comparable<T>> {
	private Node<T> root;
	private int count;

	// O(1)
	public void push(T newData) {
		this.count++;
		if (root == null) {
			this.root = new Node<T>(newData);
		} else {
			// take oldval
			// stack so new element will be top of old one
			// so add new elt and make old node as next element
			Node<T> oldRoot = this.root;
			this.root = new Node<T>(newData);
			this.root.setNextNode(oldRoot);
		}

	}

	// O(1)
	public int size() {
		return this.count;
	}

	// O(1)
	public boolean isEmpty() {
		return this.root == null;
	}

	// O(1)
	public T pop() {
		T itemToPop = this.root.getData();
		this.root = this.root.getNextNode();
		this.count--;
		return itemToPop;

	}

	// O(1)
	public T peek() {
		return this.root.getData();
	}

}
