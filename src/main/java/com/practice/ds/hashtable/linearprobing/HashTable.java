package com.practice.ds.hashtable.linearprobing;

public class HashTable {

	private HashItems[] hashTable;

	public HashTable() {
		this.hashTable = new HashItems[Constants.TABLE_SIZE];
	}

	public void put(int key, int val) {
		int hashIndex = hash(key);
		System.out.println("put()"+"for val="+ val+"in index="+hashIndex);
		while (hashTable[hashIndex] != null) {
			hashIndex = (hashIndex + 1) % Constants.TABLE_SIZE;
			System.out.println("Search for next index"+hashIndex);

		}
		System.out.println("Finally inserted at index="+hashIndex);
		hashTable[hashIndex] = new HashItems(key, val);
	}
	
	public int get(int key){
		int index=hash(key);
		while(hashTable[index]!=null && hashTable[index].getKey()!=key){
			index=(index+1)%Constants.TABLE_SIZE;
			System.out.println("Generated next index"+index);
		}
		if(hashTable[index]==null){
			return -1;
		}else{
			return hashTable[index].getVal(); 
		}
	}

	public int hash(int key) {
		return key % Constants.TABLE_SIZE;
	}

}
