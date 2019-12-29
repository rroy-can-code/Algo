package com.practice.ds.linkedlist.singlyll;

public class Main {

	public static void main(String... strings) {
		SinglyLinkedListOperations ll = new SinglyLinkedListOperations();
		ll.insertAtBegin(1);
		ll.insertAtBegin(3);
		ll.insertAtBegin(5);

		ll.insertAtEnd(9);
		ll.insertAtEnd(7);
		ll.insertAtEnd(11);

		ll.insertAtSpecificPos(7, 1);
		ll.insertAtSpecificPos(17, 3);
		System.out.println("After insertion");
		ll.traverse();
		System.out.println("");
		ll.deleteFromBegin();
		ll.deleteFromEnd();
		ll.deleteFromSpecificPos(3);
		System.out.println("After deletion");
		ll.traverse();
	}

}
