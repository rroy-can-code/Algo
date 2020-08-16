package com.practice.design.lrucache;

public class App {

	public static void main(String[] args) {
     LruCache lru=new LruCache();
     lru.put(0, "codechef");
     lru.put(1, "facebook");
     lru.put(2, "google");
     lru.put(3, "youtube");
     lru.put(4, "leetcode");
     lru.put(0, "codechef");
     lru.show();
     
	}

}
