package com.practice.ds.stackandqueue.problems.maxStack;

public class App {

	public static void main(String[] args) {
		/*MaxStack ms = new MaxStack();
		ms.push(12);
		System.out.println(ms.getMaxItem());
		ms.push(2);
		System.out.println(ms.getMaxItem());
		ms.push(16);
		System.out.println(ms.getMaxItem());*/
		
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
