package com.MethodOverriding;

class C {
	void m1()
	{
		System.out.println("m1()-C");
	}
}

class D extends C{
	void m1()
	{
		System.out.println("m1()-D");
	}
}

class E extends D{
	void m1()
	{
		System.out.println("m1()-E");
	}
}

public class Test_1 {
	public static void main(String[] args)
	{
		E e = new E();
		e.m1();
	}
}
