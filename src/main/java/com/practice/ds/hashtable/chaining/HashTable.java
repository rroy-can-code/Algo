package com.practice.ds.hashtable.chaining;

public class HashTable {
	private HashItems[] hashtable;

	public HashTable() {
		hashtable = new HashItems[Constants.TABLE_SIZE];
	}

	private int hash(int key) {
		return key % Constants.TABLE_SIZE;
	}

	public void put(int key, int val) {
		int hashIndex = hash(key);
		if (hashtable[hashIndex] == null) {
			System.out.println("No Collision");
			hashtable[hashIndex] = new HashItems(key, val);
		} else {
			System.out.println("Collision with given key" + key);
			HashItems hashItem = hashtable[hashIndex];
			//find next place till next item is empty
			while (hashItem.getNextHashItem() != null) {
				hashItem = hashItem.getNextHashItem();
			}
			//here next item is null
			System.out.println("Found the place to insert");
			hashItem.setNextHashItem(new HashItems(key, val));
		}
	}

	public int get(int key) {
		int index = hash(key);
		if (hashtable[index] == null) {
			return -1;
		} else {
			HashItems item = hashtable[index];
			while (item != null && item.getKey() != key) {
				item = item.getNextHashItem();
			}
			if (item == null) {
				return -1;
			} else {
				return item.getVal();
			}
		}
	}

}
