package com.Binding;

class A{
	int i = 10;
	static int j = 20;
	
	static void m1()
	{
		System.out.println("M1()-A");
	}
	
	void m2()
	{
		System.out.println("M2()-A");
	}
}

class B extends A{
	int i = 30;
	static int j = 40;
	
	static void m1()
	{
		System.out.println("M1()-B");
	}
	
	void m2()
	{
		System.out.println("M2()-B");
	}
}

public class Test {
	public static void main(String[] args)
	{
		A a = new B();
		System.out.println(a.i);
		System.out.println(a.j);
		a.m1();
		a.m2();
	}
}
