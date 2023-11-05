package com.leetcode.maxStack;

public class App {

	public static void main(String[] args) {
		MaxStackWithPopAllowed stack=new MaxStackWithPopAllowed();
		stack.push(11);
		stack.push(1);
		stack.push(12);
		stack.push(3);
		System.out.println(stack.getMax());
		System.out.println(stack.pop());
		System.out.println(stack.getMax());
	}

}
