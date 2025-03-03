package com.ThisKeyword;

public class A {
	int i;
	
	public void display(int i)
	{
		System.out.println(i);  // local variable
		System.out.println(this.i); // non-static variable
	}
	
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.i = 10;
		a1.display(100);
		
		System.out.println("==================");
		
		A a2 = new A();
		a2.i = 20;
		a2.display(200);
	}
}
