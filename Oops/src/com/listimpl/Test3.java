package com.listimpl;

public class Test3 {
	public static void main(String[] args) {
////		Node first = new Node(10,null);
////		first.next = new Node(20,null);
////		first.next.next =new Node(30,null);
////		first.next.next.next = new Node(40,null);
////		
//		Node curr = first;
		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		for(int i = 0;i<l.size();i++) {
			System.out.println((Integer)l.get(i));
		}
		
		l.reverse();
		for(int i = 0;i<l.size();i++) {
			System.out.println((Integer)l.get(i));
		}
		
	}
}
