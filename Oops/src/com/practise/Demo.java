package com.practise;

public class Demo {

	public static void main(String[] args) {
		A a1 = A.getInst();
		A a2 = A.getInst();
		A a3 = A.getInst();
		A a4 = A.getInst();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		
		System.out.println(a1 == a2);
	}

}
