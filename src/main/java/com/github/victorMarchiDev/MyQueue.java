package com.github.victorMarchiDev;

import java.util.Queue;
import java.util.Stack;

public class MyQueue {
	private Node first;
	private Node last;
	
	private void add(int value) {
		Node newLast = new Node(value);
		if(last != null) {
			last.next = newLast;
		}
		
		last = newLast;
		
		if(first == null) {
			first = last;
		}
	}
	
	public int remove() {
		if(first == null) {
			System.out.println("Pilha vazia");
		}
		
		int firstValue = first.value;
		first = first.next;
		
		if(first == null) {
			last = null;
		}
		
		return firstValue;
	}
	
	public int peek() {
		if(first == null) {
			System.out.println("Pilha vazia");
		}
		
		return first.value;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	

}
