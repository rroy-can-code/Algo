package com.practice.ds.linkedlist;

import java.util.HashMap;

/**
 * Idea is to when call a get we will delete the node and add to head of linked
 * list
 */
public class LRUCache {
	private HashMap<Integer, Node> map;
	private int capacity, count;
	private Node head, tail;

	public LRUCache(int c) {
		this.capacity = c;
		map = new HashMap<Integer, Node>();
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.prev = head;
		head.prev = null;
		tail.next = null;
		count = 0;
	}

	public void deleteNode(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	//
	// |111|->|N|1|211|->|111|2||311|->|211|3|N|->|311|
	// Head       111         211          311    Tail
	//
	// |N||4|N|
	// 444
	//
	// |444|->  |N|4|111| <->|444|1|211|<->|111|2||311|<->|211|3|N|<->|311|
	// Head         444           111            211         311      Tail
	//     
	// ->|N|4|111|<->
	// 444
	public void addToHead(Node node) {
		node.next = head.next;
		node.next.prev = node;
		node.prev = head;
		head.next = node;
	}

	public int get(int key) {
		if (map.get(key) != null) {
			Node node = map.get(key);
			int result = node.val;
			deleteNode(node);
			addToHead(node);
			System.out.println("Got the value : " + result + " for the key: " + key);
			return result;
		}
		System.out.println("No val is present" + " for the key: " + key);
		return -1;
	}
	
	public void set(int key, int value) {
		System.out.println("Setting the (key, " + "value) : (" + key + ", " + value + ")");
		if (map.get(key) != null) {
			Node node = map.get(key);
			node.val = value;
			deleteNode(node);
			addToHead(node);
		} else {
			Node node = new Node(key, value);
			map.put(key, node);
			if (count < capacity) {
				count++;
				addToHead(node);
			} else {
				map.remove(tail.prev.key);
				deleteNode(tail.prev);
				addToHead(node);
			}
		}
	}

		
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.set(1, 10);
		cache.set(2, 20);
		// i.e |Head|->||20||<->||10||
		// Calling get 1 so it is used
		cache.get(1);
		// i.e |Head|->||10||<->||20||
		cache.set(3, 30);
		// i.e |Head|->||30||<->||10||
		// Size 2 so it will remove 20 as it is LRU
		cache.get(2);
		cache.set(4, 40);
		// i.e |Head|->||40||<->||30||
		cache.get(1);
		cache.get(3);
		cache.get(4);
	}

}
