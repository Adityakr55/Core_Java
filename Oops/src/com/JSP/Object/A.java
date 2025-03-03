package com.JSP.Object;

public class A {
	int a;
	int b;
	int c;
	
	public void display()
	{
		A a = new A();
		
		System.out.println(a.a);
		System.out.println(b);
		System.out.println(a.c);
	}
	
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.a = 10;
		a1.b = 20;
		a1.c = 30;
		
		A a2 = new A();
		 a2.a = 40;
		 a2.b = 50;
		 a2.c = 60;
		 
		 a1.display();
		 a2.display();
	}
}
