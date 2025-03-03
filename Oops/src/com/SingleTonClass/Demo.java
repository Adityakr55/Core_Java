package com.SingleTonClass;

public class Demo {
	public static void main(String[] args)
	{
		//A a1 = new A();
		
		A a1 = A.getInst();
		A a2 = A.getInst();
		A a3 = A.getInst();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a3==a1);
		
	}
}
