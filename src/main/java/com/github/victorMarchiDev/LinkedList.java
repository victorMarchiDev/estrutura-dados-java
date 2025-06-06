package com.github.victorMarchiDev;

public class LinkedList {
	public Node head;
	
	public void appendToTail(int value) {
		if(head == null) {
			head = new Node(value);
			return;
		}

		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(value);
	}
	
	public void deleteNode(int value) {
		if(head == null ) return;
		
		if(head.value == value) {
			head = head.next;
			return;
		
		}
		
		Node current = head;
		
		while(current.next != null) {
			if(current.next.value == value) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void print() {
		if(head == null) {
			System.out.println("END");
			return;
		}
		
		Node current = head;
		
		while(current.next != null) {
			System.out.println(current.value + " -> ");
			current = current.next;
		}
		System.out.println(current.value + " -> END");
	}
}
