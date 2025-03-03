package com.SingleTonClass;

public class A {
	private static A a = null;
	
	private A() {
		
	}
	
	public static A getInst()
	{
		if(a == null)
		{
			a = new A();
			return a;
		}
		else
		{
			return a;
		}
	}
}
