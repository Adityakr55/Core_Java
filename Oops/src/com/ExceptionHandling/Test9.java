package com.ExceptionHandling;

public class Test9 {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			m1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Handled");
		}
		System.out.println("Main ends");
	}
	
	public static void m1()
	{
		System.out.println("M1() Executed");
		m2();
	}
	
	public static void m2()
	{
		System.out.println("M2() Executed");
		System.out.println(10/0);
	}
}
