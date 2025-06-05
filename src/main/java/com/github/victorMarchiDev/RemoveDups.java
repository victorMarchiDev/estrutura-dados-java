package com.github.victorMarchiDev;

import java.util.HashSet;

public class RemoveDups {
	
	public void removeDups(Node head) {
		if(head == null) return;
		
		Node current = head;
		HashSet<Integer> foundValues = new HashSet<>();
		foundValues.add(head.value);
		
		while(current != null && current.next != null) {
			if(!foundValues.add(current.next.value)) {
				current.next = current.next.next;
			}
			current = current.next;
		}
	}

}
