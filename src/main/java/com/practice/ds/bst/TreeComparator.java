package com.practice.ds.bst;

public class TreeComparator<T extends Comparable<T>> {
	public boolean compareTrees(Node<T> node1, Node<T> node2) {
		if (node1 == null || node2 == null)
			return node1 == node2;
		if (node1.getData().compareTo(node2.getData()) != 0)
			return false;

		return compareTrees(node1.getLeft(), node2.getLeft()) && compareTrees(node1.getRight(), node2.getRight());
	}

}
