package com.practice.ds.hashtable.generichashtable;

public class App {
	public static void main(String aString[]) {
		HashTable<String, Integer> ht = new HashTable<String, Integer>();
		ht.put("a", 1);
		System.out.println(ht.size());
		ht.put("b", 2);
		System.out.println(ht.size());
		ht.put("c", 3);
		System.out.println(ht.size());
		ht.put("d", 4);
		System.out.println(ht.size());
		ht.put("e", 5);
		System.out.println(ht.size());
		ht.put("f", 6);
		System.out.println(ht.size());
		ht.put("g", 7);
		System.out.println(ht.size());
		ht.put("h", 8);
		System.out.println(ht.size());
		ht.put("i", 9);
		System.out.println(ht.size());
		ht.put("j", 10);
		System.out.println(ht.size());
		ht.remove("f");
		System.out.println(ht.size());
		ht.remove("a");
		System.out.println(ht.size());
		
		

	}

}
