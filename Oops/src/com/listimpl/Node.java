package com.listimpl;

public class Node{
	
	Node prev;
	Object ele;
	Node next;
	
	
	public Node(Object e,Node n) {
		ele =e;
		next = n;
	}
}

