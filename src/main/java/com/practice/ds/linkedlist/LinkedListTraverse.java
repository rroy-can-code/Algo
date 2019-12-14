package com.practice.ds.linkedlist;

public class LinkedListTraverse {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public static void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + "->"+n.next);
			n = n.next;
		}

	}
	
	public static void deleteLast() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data + "->"+n.next);
			n = n.next;
		}
	}

	public static void main(String... a) {

		LinkedListTraverse.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		LinkedListTraverse.head.next = sec;
		sec.next = third;
		printList();
		
		

	}

}
