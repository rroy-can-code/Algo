package com.practice.ds.stack.llimpl;

public class App {

	public static void main(String[] args) {
      Stack<Integer> myStack=new Stack<Integer>();
      myStack.push(12);
      myStack.push(121);
      myStack.push(1212);
      System.out.println("Stack size: "+myStack.size());
      System.out.println("Top Element: "+myStack.peek());
      System.out.println("Popping elemets.............");
      System.out.println(myStack.pop());
      System.out.println(myStack.pop());
      System.out.println(myStack.pop());
      System.out.println("Stack is empty: "+myStack.isEmpty());
	}

}
