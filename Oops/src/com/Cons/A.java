package com.Cons;

public class A {
	
	A(){
		System.out.println("A()cons");
	}
	
	A(int i)
	{
		System.out.println("A(int i)cons");
	}
	A(int i,int j)
	{
		System.out.println("A(int i,int j)cons");
	}
	
	public static void main(String[] args)
	{
		new A();
		new A(10);
		new A(10,20);
	}
}
