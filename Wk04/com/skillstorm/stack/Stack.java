package com.skillstorm.stack;

import java.util.EmptyStackException;

public class Stack<T> {

	private final byte CAPACITY = 10;
	private Node<T> top;
	
	public Stack() {
		top = null;
	}
	
	public Stack(T thing) {
		top = new Node<>(thing);
	}
	
	public boolean push(T thing) {
		if(size() == CAPACITY)
			return false;
		if(top == null)
			top = new Node<>(thing);
		else {
			Node<T> newNode = new Node<>(thing);
			newNode.setNext(top);
			top = newNode;
		}
		return true;
	}
	
	public T peek() {
		if(top == null)
			throw new EmptyStackException();
		return top.getValue();
	}
	
	public T pop() {
		if(top == null)
			throw new EmptyStackException();
		T thing = top.getValue();
		top = top.getNext();
		return thing;
	}
	
	public int size() {
		if(top == null)
			return 0;
		int size = 1;
		Node<T> tempNode = top;
		while(tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public String toString() {
		if(top == null)
			return "[]";
		Node<T> tempNode = top;
		String myString = "[" + top.getValue();
		while(tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			myString = myString.concat(", " + tempNode.getValue());
		}
		myString = myString.concat("]");
		return myString;
	}
}
