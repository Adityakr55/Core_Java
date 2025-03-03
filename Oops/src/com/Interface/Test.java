package com.Interface;

interface I1{
	int i = 10; // here public static final is hidden i.e public static final int i =10;
	
	void m1(); // public abstract void m1(); --> this is actually written but hidden.
}

class B implements I1{
	
	static int k;
	@Override
	public void m1()
	{
		System.out.println("M1()-B");
		k = 10;
		System.out.println(k);
		
	}
}

public class Test {
	public static void main(String[] args)
	{
		 // I1 i = new I1();
		
		I1 i1 = new B();
		System.out.println(I1.i);
		
		// I1.i += 20; // CTE
		
		i1.m1();
	}
}
