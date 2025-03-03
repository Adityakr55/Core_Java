package com.ConsChaining;

class A{
	A()
	{
		System.out.println("A()-cons");
	}
}

class B extends A{
	B()
	{
		System.out.println("B()-cons");
	}
}

class C extends B{
	C()
	{
		System.out.println("C()-cons");
	}
}

public class Test {
	
	public static void main(String[] args)
	{
		new C();
	}
}
