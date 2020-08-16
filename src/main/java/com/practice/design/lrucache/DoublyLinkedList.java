package com.practice.design.lrucache;

public class DoublyLinkedList {
	private Node headNode;
	private Node tailNode;

	public Node getHeadNode() {
		return headNode;
	}

	public Node getTailNode() {
		return tailNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	public void setTailNode(Node tailNode) {
		this.tailNode = tailNode;
	}

}
