package com.practice.ds.hashtable.linearprobing;

public class App {

	public static void main(String[] args) {
     HashTable ht=new HashTable();
     ht.put(1, 12);
     ht.put(1, 11);
     ht.put(2, 21);
     System.out.println(ht.get(1));
     
	}

}
