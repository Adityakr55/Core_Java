package com.listimpl;

public class DoublyLinkedListDriver {
	public static void main(String[] args) {
		DoublyLinkedList l = new DoublyLinkedList();
		
		l.addpos(50,0);
		for(int i = 0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("");
		for(int i = 0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
}
