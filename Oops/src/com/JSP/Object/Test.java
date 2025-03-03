package com.JSP.Object;

public class Test {
	public static void m1(int i)
	{
		System.out.println("m1(int i):"+i);
	}
	
	public static void m2(A a)
	{
		System.out.println("m2(A a):");
	}
	
	public static void m3(B b)
	{
		System.out.println("m3(B b):");
	}
	
	public static void m4(Emp e)
	{
		System.out.println("m4(Emp e):");
	}
	
	public static void main(String[] args)
	{
		m1(20);
		A a = new A();
		m2(a);
		
		m3(new B());
		Emp e = new Emp();
		m4(e);
	}
}
