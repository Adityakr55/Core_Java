package com.AbstractClass;

abstract class AA{
	abstract public void m1();
	
	public abstract void m2();
}

abstract class BB extends AA{
	@Override
	public void m1()
	{
		System.out.println("M1()-B");
	}
	
	abstract void m3();
}

class CC extends BB{
	@Override
	public void m3()
	{
		System.out.println("M3()-C");
	}
	
	@Override
	public void m2()
	{
		System.out.println("M2()-C");
	}
}

public class Test_1 {
	public static void main(String[] args)
	{
		// A a = new B(); // CTE b/c B is an abstract class.
		AA a1 = new CC();
		a1.m1();
		a1.m2();
		// a1.m3(); // CTE b/c m3 method is not in class AA
		BB b1 = new CC();
		b1.m3();
		b1.m1();
		b1.m2();
	}
}
