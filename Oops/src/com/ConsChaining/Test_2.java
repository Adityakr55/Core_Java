package com.ConsChaining;

class AA{
	AA()
	{
		this(200);
		System.out.println("A()-cons");
	}
	
	AA(int i)
	{
		System.out.println("A(int i)-cons: "+i);
	}
}

class BB extends AA{
	BB()
	{
		super();
		System.out.println("B()-cons");
	}
	
	BB(int i)
	{
		this();
		System.out.println("B(int i)-cons: "+i);
	}
}

class CC extends BB{
	CC()
	{
		this(100);
		System.out.println("C()-cons");
	}
	
	CC(int i)
	{
		super(i);
		System.out.println("C(int i)-cons: "+i);
	}
}

public class Test_2 {
	public static void main(String[] args)
	{
		new CC();
	}
}
