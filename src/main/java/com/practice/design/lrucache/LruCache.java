package com.practice.design.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
	private static final int CAPCITY = 4;
	private int actualSize;
	private Map<Integer, Node> map;
	private DoublyLinkedList dll;

	public LruCache() {
		this.map = new HashMap<Integer, Node>();
		this.dll = new DoublyLinkedList();
		this.actualSize = 0;
	}

	public void put(int id, String data) {
		// containsKey(key) complexity O(1)
		if (map.containsKey(id)) {
			Node node = this.map.get(id);
			node.setData(data);
			update(node);
			return;
		}
		// if data is not present
		Node node = new Node(id, data);
		if (this.actualSize < CAPCITY) {
			this.actualSize++;
			add(node);
		} else {
			removeTail();
			add(node);
		}
	}

	// Add the node in the first position at the linked list
	// take the element from the linked list
	// make a link between its prev and next node
	//
	private void update(Node node) {
		// Current nodes prev node
		Node prev = node.getPreviousNode();
		// Current nodes next node
		Node next = node.getNextNode();
		// when current nodes previous node is null
		// make a link between current nodes prev node and next node
		if (prev != null) {
			prev.setNextNode(next);
		} else {
			// Current node is the first node of the linked list
			// popping out the current node from the dll
			// and making the next node as head node
			dll.setHeadNode(next);
		}
		if (next != null) {
			next.setPreviousNode(prev);
			prev.setNextNode(next);
		} else {
			this.dll.setTailNode(prev);
		}
		add(node);

	}

	private void removeTail() {
		Node lastNode = this.map.get(dll.getTailNode().getId());
		this.dll.setTailNode(lastNode.getPreviousNode());
		this.dll.getTailNode().setNextNode(null);
		lastNode = null;
	}

	public void add(Node node) {
		// current node next will be the previous head
		node.setNextNode(this.dll.getHeadNode());
		// current node previous is null
		node.setPreviousNode(null);
		if (dll.getHeadNode() != null) {
			dll.getHeadNode().setPreviousNode(node);
		}
		dll.setHeadNode(node);
		if (dll.getTailNode() == null) {
			dll.setTailNode(node);
		}
		this.map.put(node.getId(), node);
	}

	public Node get(int id) {
		if (!map.containsKey(id))
			return null;
		Node node = this.map.get(id);
		// take that item and add first
		update(node);
		return node;
	}

	public void show() {
		Node actualNode = this.dll.getHeadNode();
		while (actualNode != null) {
			System.out.println(actualNode.toString());
			actualNode = actualNode.getNextNode();
		}
	}
}
