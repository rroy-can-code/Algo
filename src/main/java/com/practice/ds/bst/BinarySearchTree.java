package com.practice.ds.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	private Node<T> root;

	public void insert(T data) {
		if (root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}
	}

	public void delete(T data) {
		if (root != null)
			root = deleteNode(root, data);
	}

	private Node<T> deleteNode(Node<T> node, T data) {
		if (node == null)
			return node;
		if (data.compareTo(node.getData()) < 0) {
			node.setLeft(deleteNode(node.getLeft(), data));
		} else if (data.compareTo(node.getData()) > 0) {
			node.setRight(deleteNode(node.getRight(), data));
		} else {
			if (node.getLeft() == null && node.getRight() == null) {
				System.out.println("Removing leaf node...");
				return null;
			}
			if (node.getLeft() == null) {
				System.out.println("Removing right child...");
				Node<T> tempNode = node.getRight();
				node = null;
				return tempNode;
			} else if (node.getRight() == null) {
				System.out.println("Removing left child...");
				Node<T> tempNode = node.getRight();
				node = null;
				return tempNode;
			}
			// node with 2 child
			Node<T> tempNode = getPredecessor(node.getLeft());
			node.setData(tempNode.getData());
			node.setLeft(deleteNode(node.getLeft(), tempNode.getData()));
		}
		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {
		if (node.getRight() != null) {
			return getPredecessor(node.getRight());
		}
		return node;
	}

	public void traverse() {
		if (root != null) {
			inorderTraversal(root);
		}

	}

	private void inorderTraversal(Node<T> node) {
		if (node.getLeft() != null) {
			inorderTraversal(node.getLeft());
		}
		System.out.print(node + "-->");
		if (node.getRight() != null) {
			inorderTraversal(node.getRight());
		}
	}

	public T getMax() {
		if (root == null)
			return null;
		return getMaxValue(root);
	}

	public T getMin() {
		if (root == null)
			return null;
		return getMinValue(root);
	}

	private void insertNode(T newData, Node<T> node) {
		if (newData.compareTo(node.getData()) < 0) {
			if (node.getLeft() != null) {
				insertNode(newData, node.getLeft());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setLeft(newNode);
			}
		} else {
			if (node.getRight() != null) {
				insertNode(newData, node.getRight());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setRight(newNode);
			}
		}
	}

	private T getMaxValue(Node<T> node) {
		if (node.getRight() != null)
			return getMaxValue(node.getRight());
		return node.getData();
	}

	private T getMinValue(Node<T> node) {
		if (node.getLeft() != null)
			return getMinValue(node.getLeft());
		return node.getData();
	}

	public Node<T> getRoot() {
		// TODO Auto-generated method stub
		return this.root;
	}

	public Node<T> getKSmallest(Node<T> node, int k) {
		int n = treeSize(node.getLeft()) + 1;
		if (n == k)
			return node;
		if (n > k)
			return getKSmallest(node.getLeft(), k);
		if (n < k)
			return getKSmallest(node.getRight(), k - n);

		return null;
	}

	private int treeSize(Node<T> node) {
		if (node == null)
			return 0;
		return treeSize(node.getLeft()) + treeSize(node.getRight()) + 1;// 1 for
																		// root
	}

	public int getAgeSum() {
		return getAges(this.root);
	}

	private int getAges(Node<T> node) {
		int s = 0;
		int left = 0;
		int right = 0;
		if (node == null)
			return 0;

		left = getAges(node.getLeft());
		right = getAges(node.getRight());

		s = ((Person) node.getData()).getAge() + left + right;
		return s;
	}
}
