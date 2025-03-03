package com.Blocks;

public class Demo1 {
	static {
		System.out.println("Static-Block-1");
		new Demo1();
	}
	{
		System.out.println("Non-static-Block-1");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		new Demo1();
		System.out.println("Main ends");
	}
	
	static {
		System.out.println("Static-block-2");
	}
	
	{
		System.out.println("Non-static-block-2");
	}
	
	{
		System.out.println("Non-static-block-3");
	}
	
	static {
		System.out.println("Static-block-3");
	}
	
}
