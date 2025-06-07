package com.github.victorMarchiDev;

public class MyStack {
	
	private Node top;
	
	public void push(int value) {
		Node newTop = new Node(value);
		newTop.next = top;
		top = newTop;
	}
	
	public int pop() {
		if(top == null) {
			System.out.println("Pilha vazia");
		}
		
		int topValue = top.value;
		top = top.next;
		return topValue;
	}
	
	public int peek() {
		if(top == null) {
			System.out.println("Pilha vazia");
		}
		
		return top.value;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
