package com.ConsChaining;

class D{
	{
		System.out.println("Non-static-block-D");
	}
	
	static {
		System.out.println("Static-Block-D");
	}
	
	D()
	{
		System.out.println("D()-cons");
	}
}

class E extends D{
	{
		System.out.println("Non-static-block-E");
	}
	
	static {
		System.out.println("Static-block-E");
	}
	
	E()
	{
		System.out.println("E()-cons");
	}
}

public class DriverTest {
	public static void main(String[] args)
	{
		new E();
	}
}
