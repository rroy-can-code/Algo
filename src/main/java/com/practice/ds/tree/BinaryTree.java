package com.practice.ds.tree;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		this.key = item;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;

	public BinaryTree() {
		this.root = null;
	}

	BinaryTree(int item) {
		this.root = new Node(item);
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.right.left = new Node(5);
	}
}
