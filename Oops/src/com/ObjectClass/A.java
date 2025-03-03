package com.ObjectClass;

public class A {
	int i;
	int j;
	
	public A(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public static void main(String[] args)
	{
		A a1 = new A(10,20);
		System.out.println(a1);  // this will return the @ along with unsigned hexadecimal representation of hash code of object.
		// System.out.println(a1.toString()) == System.out.println(a1)
		 
	}
}
