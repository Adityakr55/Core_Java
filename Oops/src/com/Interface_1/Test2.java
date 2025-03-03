package com.Interface_1;

interface I3{
	static void m1()
	{
		System.out.println("Static M1()-I3");
	}
	
	void m2();
	
	default void m3()
	{
		System.out.println("M3()-I3");
	}
	
	private void m4()
	{
		System.out.println("M4()-I3");
	}
}

class A implements I3{
	@Override
	public void m2()
	{
		System.out.println("M2()-A");
	}
}

public class Test2 {
	public static void main(String[] args)
	{
		I3 i = new A();
		I3.m1();
		i.m2();
		i.m3();
		
	}
	
}
