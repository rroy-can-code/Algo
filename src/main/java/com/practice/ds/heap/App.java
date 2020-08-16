package com.practice.ds.heap;

public class App {

	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.insert(11);
		heap.insert(51);
		heap.insert(31);
		heap.insert(-11);
		heap.insert(111);
		heap.insert(1);
		heap.insert(21);
		heap.insert(41);
		heap.heapSort();
		/*System.out.println(heap.poll());
		System.out.println(heap.poll());
		System.out.println(heap.poll());	
		*/
	}

}
