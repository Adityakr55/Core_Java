package com.MethodOverriding;

class A{
	void m1()
	{
		System.out.println("m1()-A");
	}
}

class B extends A{
	void m1()
	{
		System.out.println("m1()-B");
	}
}

public class Test {
	public static void main(String[] args)
	{
		B b = new B();
		b.m1();
	}
}
