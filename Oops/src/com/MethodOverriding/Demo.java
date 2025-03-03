package com.MethodOverriding;

class A_1{
	void m1()
	{
		System.out.println("m1()-A-1");
	}
}

class B_1 extends A_1{
	@Override
	void m1()
	{
		super.m1();
		System.out.println("m1()-B-1");
	}
}

public class Demo {
	public static void main(String[] args)
	{
		B_1 b = new B_1();
		b.m1();
	}
}
