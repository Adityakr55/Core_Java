package com.Blocks;

class AA{
	int i;
	static int j;
	
	{
		System.out.println("Non-static-block-1");
		j = 30;
		i = 20;
	}
	
	{
		System.out.println("Non-static-block-2");
		i = 40;
		j = 50;
	}
	
	static {
		System.out.println("Static-block-1-AA");
		j = 70;
	}
	
	static {
		System.out.println("Static-block-2-AA");
		j = 60;
	}
}

public class A {
	static {
		System.out.println("Static-block-1-A");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		new AA();
		System.out.println(new AA().i);
		
	}
}
