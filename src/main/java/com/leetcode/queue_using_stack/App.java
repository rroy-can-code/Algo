package com.leetcode.queue_using_stack;

public class App {

	public static void main(String[] args) {
		QueueUsingSingleStack q=new QueueUsingSingleStack();
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
