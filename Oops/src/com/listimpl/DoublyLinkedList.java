package com.listimpl;

class Node1{
	Node1 prev;
	Object ele;
	Node1 next;
	
	Node1(Object e){
		ele = e;
	}
	public Node1(Node1 prev,Object ele,Node1 next) {
		this.prev = prev;
		this.ele = ele;
		this.next = next;
	}
}

public class DoublyLinkedList {
	private int count = 0;
	private Node1 head = null;
	private Node1 last = null;
	
	
	// add node at last
	public void add(Object e) {
		if(head == null) {
			head = new Node1(null,e,null);
			last = head;
			count++;
			return;
		}
		Node1 curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		
		curr.next = new Node1(curr,e,null);
		last = curr.next;
		count++;
	}
	
	// size of list.
	public int size() {
		return count;
	}
	
	// get value of element at an index.
	public Object get(int index) {
		if(index<0 || index >size()-1) {
			throw new IndexOutOfBoundsException();
		}
		Node1 curr = head;
		if(index == 0) {
			return head.ele;
		}
		for(int i = 1;i<=index;i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	
	// add element at a position.
	public void addpos(Object e,int index) {
		if(index<0 || index>size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Node1 n = new Node1(e);
		
		if(head == null) {
			head = n;
			count++;
			return;
		}
		
		if(index == 0) {
			n.next = head;
			head.prev = n;
			head = n;
			count++;
			return;
		}
		
		if(index == size()) {
			last.next = n;
			n.prev = last;
			last = n;
			count++;
			return;
		}
		
		Node1 curr = head;
		for(int i = 1;i<index;i++) {
			curr = curr.next;
		}
		
		n.next = curr.next;
		n.prev = curr;
		curr.next.prev = n;
		curr.next = n;
		count++;
	}
	
	// print the element in reverse direction.
	public void traverseReverse() {
		Node1 curr = last;
		while(curr != null) {
			System.out.println(curr.ele);
			curr = curr.prev;
		}
		
	}
	
	public void remove(int index) {
		if(index<0 || index>size()-1) {
			throw new IndexOutOfBoundsException();
		}
		if(index == 0) {
			head = head.next;
			head.prev = null;
			count--;
			return;
		}
		if(index == size()-1) {
			last = last.prev;
			last.next = null;
			count--;
			return;
		}
		
		Node1 curr = head;
		for(int i = 1;i<index;i++) {
			curr = curr.next;
		}
		curr.next.next.prev = curr;
		curr.next = curr.next.next;
		count--;
	}
}
