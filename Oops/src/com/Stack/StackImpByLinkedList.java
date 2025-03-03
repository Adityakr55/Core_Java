package com.Stack;

import java.util.EmptyStackException;

class Node{
	Node next;
	Object ele;
	
	
	public Node(Object e,Node n) {
		ele =e;
		next = n;
	}
}

public class StackImpByLinkedList {
	private Node head;
	private int count = 0;
	
	public void push(Object ele) {
//		if(head == null) {
//			head = new Node(ele,head);
//			count++;
//			return;
//		}
		
// simplified code 
		head = new Node(ele,head);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return head.ele;
	}
	
	public Object pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Object temp = head.ele;
		head = head.next;
		count--;
		return temp;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
}
