package com.practice.ds.hashtable.chaining;

public class App {

	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put(1, 10);
		System.out.println();
		ht.put(1, 12);
		ht.put(1, 18);
		ht.put(2, 19);

		System.out.println(ht.get(1));
	}

}
