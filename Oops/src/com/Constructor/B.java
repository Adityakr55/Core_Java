package com.Constructor;

public class B {
	B(int i)
	{
		System.out.println("B(int i):"+i);
	}
	
	public static void main(String[] args)
	{
		new B(10);
		new B(10+10);
		// new B(10.3);  CTE
	}

}
