package com.Stack;

public class StackImpByArraylistDriver {
	public static void main(String[] args) {
		StackImpByArrayList s = new StackImpByArrayList();
		System.out.println(s.isEmpty());
		s.push(10);
		System.out.println(s.peek());
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.size());
		
	}
}
