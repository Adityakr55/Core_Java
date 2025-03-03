package com.MethodHiding;

class A{
	
	final int b=5;// final variable does not have any default value.
	
//	public A() {
//		b = 20;
//	}
//	
//	{
//		b = 20;
//	}
	void m1()
	{
		final int d;
		d = 30;
		System.out.println("M1()-A");
	}
	final int a=21;
	
	static void m2()
	{
		
		System.out.println("M2()-A");
	}
}

class B extends A{
	@Override
	void m1()
	{
		System.out.println();
		System.out.println(a); // final non-static variable is inherited.
		System.out.println("M1()-B");
	}
	
	static void m2()
	{
		//Method hiding
		System.out.println("M2()-B");
		
	}
	
}

public class Test {
	public static void main(String[] args)
	{
		B b = new B();
		b.m1(); // Method overriding
		b.m2(); // Method hiding
		
	}
}
