package com.AbstractClass;

abstract class A {
	abstract public void m1();
}

class B extends A{
	@Override
	public void m1()
	{
		System.out.println("M1()-B");
	}
	public void m2()
	{
		System.out.println("Aditya");
	}
}

public class Test{
	public static void main(String[] args)
	{
		// A a = new A(); // CTE we can't create object for the abstract class b/c it is an incomplete class.
		A a = new B();
		a.m1();  // since m1 is overridden method of A class that's why we can access with a reference. other wise we have to downcast it.
		
	}
}
