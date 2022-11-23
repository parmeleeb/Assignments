package com.skillstorm.stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> myStack = new Stack<>();
		Stack<Integer> intStack = new Stack<>(1);
		System.out.println(myStack);
		System.out.println(intStack);
		System.out.println();
		
		System.out.println(myStack.isEmpty());
		System.out.println(intStack.isEmpty());
		System.out.println(intStack.peek());
		System.out.println();
		
		intStack.pop();
		System.out.println(intStack);
		System.out.println(intStack.isEmpty());
		System.out.println();
		
		myStack.push(null);
		myStack.push("Hi");
		myStack.push("Hello");
		myStack.push("Hey");
		myStack.push(null);
		myStack.push("Hi");
		myStack.push("Hello");
		myStack.push("Hey");
		myStack.push("Hello");
		myStack.push("Hey");
		System.out.println(myStack);
		
		System.out.println(myStack.pop());
		System.out.println(myStack);
		System.out.println();
		
		myStack.push(null);
		System.out.println(myStack);
		myStack.push("Hey");
		System.out.println(myStack);
		
		System.out.println(myStack.size());
		System.out.println(intStack.size());
		
		
	}

}
