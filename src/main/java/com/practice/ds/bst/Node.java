package com.practice.ds.bst;

public class Node<T> {
	private T data;
	private Node<T> left;
	private Node<T> right;

	public Node(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}

}
