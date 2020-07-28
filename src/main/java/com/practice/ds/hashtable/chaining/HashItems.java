package com.practice.ds.hashtable.chaining;

public class HashItems {
	private int key;
	private int val;
	private HashItems nextHashItem;

	public HashItems(int key, int val) {
		super();
		this.key = key;
		this.val = val;
	}

	public int getKey() {
		return key;
	}

	public int getVal() {
		return val;
	}

	public HashItems getNextHashItem() {
		return nextHashItem;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public void setNextHashItem(HashItems nextHashItem) {
		this.nextHashItem = nextHashItem;
	}

	@Override
	public String toString() {
		return "HashItems [key=" + key + ", val=" + val + "]";
	}

}
