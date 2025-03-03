package com.JSP.Object;

public class C {
	public static void m1()
	{
		System.out.println("m1() is executed");
	}
	
	public static int m2()
	{
		System.out.println("m2() is executed");
		return 10;
	}
	
	public static A m3()
	{
		System.out.println("m3() is executed");
		A a = new A();
		return a;
	}
	
	public B m4()
	{
		System.out.println("m4() is executed");
		return new B();
	}
	
	public static void main(String[] args)
	{
		m1();
		int n = m2();
		A a = m3();
		C t = new C();
		B b = t.m4();
		
		System.out.println(n);
		System.out.println(a);
		System.out.println(b);
		
	}
}
