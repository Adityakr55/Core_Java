package com.Encapsulation;

public class Test {
	public static void main(String[] args)
	{
		A a1 = new A();
		// System.out.println(a1.i); // CTE
		// System.out.println(a1.j); // CTE
		
		System.out.println(a1.getI()); 
		System.out.println(a1.getJ());
		
		// a1.i = 100; // CTE
		// a1.j = 200; // CTE
		
		a1.setI(100);
		a1.setJ(200);
		
		System.out.println(a1.getI());
		System.out.println(a1.getJ());
	}
}
