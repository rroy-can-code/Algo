package com.practice.ds.stack.arrayimpl;

public class App {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(12);
		stack.push(123);
		stack.push(1234);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}
}
