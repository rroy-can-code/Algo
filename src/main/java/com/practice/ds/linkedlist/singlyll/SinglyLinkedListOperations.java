package com.practice.ds.linkedlist.singlyll;

/**
 * 
 * This class is used for insert/delete node in several positions
 *
 */
public class SinglyLinkedListOperations {
	Node head;

	/**
	 * insert data at first position
	 * 
	 * @param data to be inserted
	 */
	public void insertAtBegin(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	/**
	 * insert data at last position
	 * 
	 * @param data to be inserted
	 */
	public void insertAtEnd(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = null;
		}
	}

	/**
	 * insert data at given position
	 * 
	 * @param data to be inserted
	 * @param loc  where to be inserted
	 */
	public void insertAtSpecificPos(int data, int loc) {

		Node node = new Node(data);
		Node temp = head;
		if (head == null) {
			head = node;
		} else {
			for (int i = 0; i < loc - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}

	/**
	 * delete from begin
	 */
	public void deleteFromBegin() {
		if (head == null) {
			System.out.println("Already Empty ");
		} else {
			head = head.next;
		}

	}

	/**
	 * delete from end
	 */
	public void deleteFromEnd() {
		Node temp = head;
		while (temp.next.next != null)
			temp = temp.next;
		temp.next = null;

	}

	/**
	 * delete from given position
	 * 
	 * @param pos
	 */
	public void deleteFromSpecificPos(int pos) {
		Node temp = head;
		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;

	}

	/**
	 * traversing the linked list
	 */
	public void traverse() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ->");
			node = node.next;
		}
		System.out.print(" NULL");
	}

}
