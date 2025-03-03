package com.ThisKeyword;

public class B {
	int i;
	int j;
	
	public void add(int a, int b)
	{
		i = a;
		j = b;
	}
	
	public void display(int i, int j)
	{
		B b = new B();
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(b.i);
		System.out.println(b.j);
		
		System.out.println(this.i);
		System.out.println(this.j);
	}
	
	public static void main(String[] args)
	{
		B b1 = new B();
		b1.add(10, 20);
		b1.display(30, 40);
	}
}
