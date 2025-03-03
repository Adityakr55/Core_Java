package com.Blocks;

class AAA{
	int i;
	static int j;
	static{
		System.out.println("Static-block-1-A");
		j = 10;
	}
	
	{
		System.out.println("Non-static-block-1-A");
		i = 20;
		j = 30;
	}
	{
		System.out.println("Non-static-block-2-A");
		i = 40;
		j = 50;
	}
	static {
		System.out.println("Static-block-2-A");
		j = 60;
	}
}

public class Test {
	static {
		System.out.println("Static-block-1-test");
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		System.out.println(AAA.j);
		AAA a = new AAA();
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(AAA.j);
		System.out.println("Main ends");
	}
	
	static {
		System.out.println("Static-block-2-test");
	}

}
