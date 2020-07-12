package com.practice.ds.bst;

public interface Tree<T> {
	public Node<T> getKSmallest(Node<T>node,int k);
	public Node<T> getRoot();

	public void insert(T data);

	public void delete(T data);

	public void traverse();

	public T getMax();

	public T getMin();
	
	public int getAgeSum();

}
