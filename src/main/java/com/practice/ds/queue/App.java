package com.practice.ds.queue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(121);
		q.enqueue(1211);
		q.enqueue(12111);
		q.enqueue(121111);
		System.out.println(q.size());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
	}

}
