package com.Blocks;

public class Demo {
	static int j;
	{
		System.out.println("Non-static-Block-1");
		j = 10;
		System.out.println(j);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		new Demo();
		new Demo();
		System.out.println("Main ends");
		
	}
	
	{
		System.out.println("Non-static-Block-2");
	}
	
	{
		System.out.println("Non-static-Block-3");
	}
}
