package com.practice.ds.hashtable.generichashtable;

@SuppressWarnings("unchecked")
public class HashTable<Key, Value> {
	private Key[] keys;
	private Value[] values;
	private int noOfItems;
	private int capacity;

	public HashTable() {
		this.keys = (Key[]) new Object[Constants.TABLE_SIZE];
		this.values = (Value[]) new Object[Constants.TABLE_SIZE];
		this.noOfItems = 0;
		this.capacity = Constants.TABLE_SIZE;
	}

	// For rehashing
	public HashTable(int newCapacity) {
		this.keys = (Key[]) new Object[newCapacity];
		this.values = (Value[]) new Object[newCapacity];
		this.noOfItems = 0;
		this.capacity = newCapacity;
	}

	public int size() {
		return this.noOfItems;
	}

	public boolean isEmpty() {
		return noOfItems == 0;
	}

	private int hash(Key key) {
		return key.hashCode() % capacity;
	}

	public Value get(Key key) {
		if (key == null)
			return null;
		int index = hash(key);
		while (keys[index] != null) {
			if (keys[index].equals(key))
				return values[index];
			index = (index + 1) % capacity;
		}
		return null;
	}

	public void put(Key k, Value v) {
		if (k == null || v == null)
			return;
		if (noOfItems > capacity * 0.75) {
			System.out.println("Doubling the size of hash table");
			resize(capacity * 2);
		}
		int index = hash(k);
		while (keys[index] != null) {
			if (keys[index].equals(k)) {
				values[index] = v;
				return;
			}
			index = (index + 1) % capacity;
		}
		keys[index] = k;
		values[index] = v;
		noOfItems++;
	}

	public void remove(Key key) {
		if (key == null)
			return;
		int index = hash(key);
		while (keys[index]!=null && !keys[index].equals(capacity)) {
			index = (index + 1) % capacity;
		}
		keys[index] = null;
		values[index] = null;
		noOfItems--;
		while (keys[index] != null) {
			Key tempKey = keys[index];
			Value tempVal = values[index];
			keys[index] = null;
			values[index] = null;
			noOfItems--;
			put(tempKey, tempVal);
			index = (index + 1) % capacity;
			if (noOfItems <= capacity / 3) {
				System.out.println("Half the size of hash table");
				resize(capacity / 2);// if 1/3 rd is only full resize to save
										// the space
			}
		}
	}

	public void resize(int newCapacity) {
		HashTable<Key, Value> table = new HashTable<Key, Value>(newCapacity);
		for (int i = 0; i < newCapacity; i++) {
			if (keys[i] != null) {
				table.put(keys[i], values[i]);
			}
			keys = table.getKeys();
			values = table.getValues();
			capacity = table.getCapacity();
		}
	}

	public Key[] getKeys() {
		return keys;
	}

	public Value[] getValues() {
		return values;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setKeys(Key[] keys) {
		this.keys = keys;
	}

	public void setValues(Value[] values) {
		this.values = values;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
