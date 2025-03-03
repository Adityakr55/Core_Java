package com.practise;

public class A {
	private static A a = null;
	
	private A() {
		
	}
	
	public static A getInst() {
		if(a == null) {
			A a = new A();
			return a;
		}
		else {
			return a;
		}
		
	}
}
