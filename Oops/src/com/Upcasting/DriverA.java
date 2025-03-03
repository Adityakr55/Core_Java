package com.Upcasting;

class A{
	void m()
	{
		System.out.println("m()-A");
	}
	void m1()
	{
		System.out.println("m1()-A");
	}
}

class B extends A{
	void m()
	{
		System.out.println("m()-B");
	}
	void m2()
	{
		System.out.println("m1()-B");
	}
}

class C extends B{
	void m3()
	{
		System.out.println("m3()-C");
	}
	void m()
	{
		System.out.println("m()-C");
	}
}
public class DriverA {
	public static void main(String[] args)
	{
		A a = new B();
		a.m(); // 1st compile time binding after that run time binding will occur hence during run time B class overridden m method will execute.
		a.m1();
		// a.m2(); // this will throw CTE b/c in late binding 1st early binding takes place and during early binding the reference a will check is
		// there m2() method exist in class A or not if not exist then it will throw compile time error.
		
	}
}
